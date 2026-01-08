package com.example.order_service.domain.services;

import com.example.order_service.domain.entities.Order;
import com.example.order_service.domain.entities.OrderLineItem;
import com.example.order_service.domain.events.OrderPlacedEvent;
import com.example.order_service.domain.repos.OrderRepo;
import com.example.order_service.domain.services.clients.InventoryFeignClient;
import com.example.order_service.web.models.InventoryResponse;
import com.example.order_service.web.models.OrderLineItemsDto;
import com.example.order_service.web.models.OrderRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final InventoryFeignClient inventoryFeignClient;
    private final OrderRepo orderRepo;
    private final KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;

    public String placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());



        List<OrderLineItem> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderLineItemsList(orderLineItems);

        List<String> skuCodes = order.getOrderLineItemsList().stream()
                .map(OrderLineItem::getSkuCode)
                .toList();

        List<InventoryResponse> items = inventoryFeignClient.isInStock(skuCodes);

        items.forEach(inventoryResponse -> {
            if(!inventoryResponse.isInStock())             throw new IllegalArgumentException("Product is not in stock, please try again later");

        });
        orderRepo.save(order);
        kafkaTemplate.send("notificationTopic",new OrderPlacedEvent(order.getOrderNumber()));
        return "orderPlaced";


    }
    private OrderLineItem mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItem orderLineItems = new OrderLineItem();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}

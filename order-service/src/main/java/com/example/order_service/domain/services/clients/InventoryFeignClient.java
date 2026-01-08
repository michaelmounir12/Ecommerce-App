package com.example.order_service.domain.services.clients;

import com.example.order_service.web.models.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("inventory-service")
public interface InventoryFeignClient {
    @GetMapping(value = "/api/inventory" ,consumes = "application/json")
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode);
}

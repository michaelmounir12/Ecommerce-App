package com.example.order_service.domain.repos;

import com.example.order_service.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
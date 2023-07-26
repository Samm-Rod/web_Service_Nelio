package com.web.service.repositories;

import com.web.service.entities.Order;
import com.web.service.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Long> {



}

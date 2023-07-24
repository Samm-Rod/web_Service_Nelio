package com.web.service.repositories;

import com.web.service.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositories extends JpaRepository<Order, Long> {



}

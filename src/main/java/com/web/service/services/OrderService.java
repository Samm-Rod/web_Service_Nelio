package com.web.service.services;

import com.web.service.entities.Order;
import com.web.service.entities.User;
import com.web.service.repositories.OrderRepositories;
import com.web.service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositories orp;

    public List<Order> findAll(){
        return orp.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orp.findById(id);
        return obj.get();
    }

}

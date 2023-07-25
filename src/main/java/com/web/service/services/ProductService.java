package com.web.service.services;

import com.web.service.entities.Product;
import com.web.service.entities.User;
import com.web.service.repositories.ProductRepositories;
import com.web.service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositories prp;

    public List<Product> findAll(){
        return prp.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = prp.findById(id);
        return obj.get();
    }

}

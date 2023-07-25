package com.web.service.services;

import com.web.service.entities.Category;
import com.web.service.entities.User;
import com.web.service.repositories.CategoryRepositories;
import com.web.service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepositories crp;

    public List<Category> findAll(){
        return crp.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = crp.findById(id);
        return obj.get();
    }

}

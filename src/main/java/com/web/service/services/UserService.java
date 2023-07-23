package com.web.service.services;

import com.web.service.entities.User;
import com.web.service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositories urp;

    public List<User> findAll(){
        return urp.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = urp.findById(id);
        return obj.get();
    }

}

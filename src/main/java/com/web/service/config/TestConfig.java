package com.web.service.config;

import com.web.service.entities.User;
import com.web.service.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
//@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepositories urp;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User();
        User u2 = new User();
        urp.saveAll(Arrays.asList(u1, u2));
    }
}

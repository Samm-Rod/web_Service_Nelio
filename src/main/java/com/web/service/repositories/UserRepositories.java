package com.web.service.repositories;

import com.web.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositories extends JpaRepository<User, Long> {


}

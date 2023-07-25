package com.web.service.repositories;

import com.web.service.entities.Category;
import com.web.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Long> {


}

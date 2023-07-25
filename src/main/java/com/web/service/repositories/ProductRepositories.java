package com.web.service.repositories;

import com.web.service.entities.Category;
import com.web.service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product, Long> {


}

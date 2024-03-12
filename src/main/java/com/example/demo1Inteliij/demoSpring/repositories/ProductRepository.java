package com.example.demo1Inteliij.demoSpring.repositories;

import com.example.demo1Inteliij.demoSpring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductName(String productName);
}

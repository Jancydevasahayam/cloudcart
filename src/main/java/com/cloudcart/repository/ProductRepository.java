package com.cloudcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cloudcart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

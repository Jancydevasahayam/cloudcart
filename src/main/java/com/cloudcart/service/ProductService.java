package com.cloudcart.service;

import com.cloudcart.repository.ProductRepository;
import com.cloudcart.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Cacheable("products")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
}

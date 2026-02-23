package com.cloudcart.controller;

import com.cloudcart.service.ProductService;
import com.cloudcart.model.Product;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Product> products() {
        return service.getAllProducts();
    }

    @MutationMapping
    public Product createProduct(@Argument String name, @Argument Double price) {
        return service.saveProduct(new Product(null, name, price));
    }
}

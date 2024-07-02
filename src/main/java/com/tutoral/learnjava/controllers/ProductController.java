package com.tutoral.learnjava.controllers;

import com.tutoral.learnjava.models.Product;
import com.tutoral.learnjava.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Products")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    List<Product> getAllProduct() {
//        return List.of(
//            new Product(1L, "macbook pro", 2000, 2400.0, ""),
//            new Product(2L, "ipad", 2000, 2400.0, "")
//        );
        return repository.findAll();
    }
}

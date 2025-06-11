package com.example.demo.Product;

import com.example.demo.Product.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productrepository;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        return ResponseEntity.ok(productrepository.findAll());
    }
}

package com.matchesfashion.papi.controller;

import com.matchesfashion.papi.domain.Product;
import com.matchesfashion.papi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/productsWithPrice")
    public List<Product> getProductsWithPrice(@RequestParam(defaultValue = "100", required = false) Integer price) {
        return productService.getProducts(price);
    }
}
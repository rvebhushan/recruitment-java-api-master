package com.matchesfashion.papi.service;

import com.matchesfashion.papi.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(Integer price);
    List<Product> getAllProducts();
}

package com.matchesfashion.papi.service.impl;

import com.matchesfashion.papi.domain.Product;
import com.matchesfashion.papi.repository.ProductRepository;
import com.matchesfashion.papi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts(Integer price) {
        return productRepository.getProducts(price);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}

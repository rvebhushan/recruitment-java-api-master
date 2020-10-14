package com.matchesfashion.papi.service.impl;

import com.matchesfashion.papi.domain.Product;
import com.matchesfashion.papi.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl service;
    @Mock
    private ProductRepository productRepository;

    @Mock
    private Product product;

    @Before
    public void setup()
    {
        List<Product> products = Arrays.asList(product);

        Mockito.when(productRepository.getProducts(100)).thenReturn(products);
        Mockito.when(productRepository.findAll()).thenReturn(products);
    }

    @Test
    public void getProducts() {
        assertEquals(service.getProducts(100).size(), 1);
    }

    @Test
    public void getAllProducts() {
        assertEquals(service.getAllProducts().size(), 1);
    }
}
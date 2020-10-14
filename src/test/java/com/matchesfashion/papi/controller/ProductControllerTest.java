package com.matchesfashion.papi.controller;

import com.matchesfashion.papi.domain.Product;
import com.matchesfashion.papi.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;
    @Mock
    private ProductService service;

    @Mock
    private Product product;

    @Before
    public void setup()
    {
        List<Product> products = Arrays.asList(product);

        Mockito.when(service.getAllProducts()).thenReturn(products);
    }

    @Test
    public void getAllProducts() {
        assertEquals(productController.getAllProducts().size(), 1);
    }

    @Test
    public void getAllProductsWithPrice() {
        Mockito.when(service.getAllProducts()).thenReturn(Collections.emptyList());
        assertEquals(productController.getAllProducts().size(), 0);
    }
}
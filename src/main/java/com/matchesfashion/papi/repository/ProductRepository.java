package com.matchesfashion.papi.repository;

import com.matchesfashion.papi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p  WHERE p.price >(:price)")
    List<Product> getProducts(@Param("price") Integer price);
}

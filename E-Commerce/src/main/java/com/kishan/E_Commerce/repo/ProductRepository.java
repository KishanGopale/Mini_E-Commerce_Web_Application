package com.kishan.E_Commerce.repo;

import com.kishan.E_Commerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

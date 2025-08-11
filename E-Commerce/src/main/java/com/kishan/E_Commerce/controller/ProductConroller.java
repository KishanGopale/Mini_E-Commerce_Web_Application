package com.kishan.E_Commerce.controller;


import com.kishan.E_Commerce.model.Product;
import com.kishan.E_Commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductConroller {

    @Autowired
    ProductService productService;

    @GetMapping
     List<Product> getAllProducts(){
         return productService.getAllProducts();
     }

     @GetMapping("/{id}")
     public Product getProductById(@PathVariable Long id) {
         return productService.getProductById(id);
     }

     @PostMapping
     public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
     }

     @DeleteMapping("/{id}")
     public void deleteProduct(@RequestBody Long id) {
         productService.deleteProduct(id);
     }
}

package com.example.shop.controllers;

import com.example.shop.dto.ProductDto;
import com.example.shop.models.Product;
import com.example.shop.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<ProductDto> getAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){
        return productService.
                findById(id).
                map(ResponseEntity::ok).
                orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/category/{id}")
    public List<Product> getAllFromCategory(@PathVariable Long id){
        return productService.findAllFromCategory(id);
    }

}

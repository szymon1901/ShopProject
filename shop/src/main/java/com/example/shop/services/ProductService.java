package com.example.shop.services;

import com.example.shop.dto.ProductDto;
import com.example.shop.mapper.ProductMapper;
import com.example.shop.models.Product;
import com.example.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findById(Long id){
        if (id == null){
            throw new NullPointerException("Produkt o podnym adresie id nie istnieje");
        }else
            return productRepository.findById(id);
    }
    public List<Product> findAllFromCategory(Long id) {
        return productRepository.findByCategoryId(id);
    }

    public List<ProductDto> findAll(){
        return productRepository.
                findAll().
                stream().
                map(ProductMapper::toDTO).
                collect(Collectors.toList());
    }
}

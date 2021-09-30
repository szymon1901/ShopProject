package com.example.shop.mapper;

import com.example.shop.dto.ProductDto;
import com.example.shop.models.Product;

public class ProductMapper {
    public static ProductDto toDTO(Product product){
        ProductDto toDto = new ProductDto();
        toDto.setName(product.getName());
        toDto.setDescription(product.getDescription());
        toDto.setPrice(product.getPrice());
        toDto.setStock(product.getStock());
        return toDto;
    }


}

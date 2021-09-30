package com.example.shop.mapper;

import com.example.shop.dto.CategoryDto;
import com.example.shop.models.Category;

public class CategoryMapper {
    public static CategoryDto toDto(Category category){
        CategoryDto dto = new CategoryDto();
        dto.setId(category.getId());
        dto.setName(category.getName());
        return dto;
    }
}

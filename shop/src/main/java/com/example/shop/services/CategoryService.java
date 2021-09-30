package com.example.shop.services;

import com.example.shop.dto.CategoryDto;
import com.example.shop.mapper.CategoryMapper;
import com.example.shop.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> findAllNames(){
        return categoryRepository.
                findAll().
                stream().
                map(CategoryMapper::toDto).
                collect(Collectors.toList());
    }
}

package com.java.car.service;

import com.java.car.dto.CarDetailCategoryDTO;
import com.java.car.repository.CarDetailCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDetailCategoryService {
    private final CarDetailCategoryRepository categoryRepository;

    public CarDetailCategoryService(CarDetailCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CarDetailCategoryDTO> getAllCategories() {
        return categoryRepository.findAllCategories();
    }
}

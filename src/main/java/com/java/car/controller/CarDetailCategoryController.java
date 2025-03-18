package com.java.car.controller;

import com.java.car.dto.CarDetailCategoryDTO;
import com.java.car.service.CarDetailCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-detail-categories")
@CrossOrigin(origins = "http://localhost:5137")
public class CarDetailCategoryController {
    private final CarDetailCategoryService categoryService;

    public CarDetailCategoryController(CarDetailCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CarDetailCategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }
}

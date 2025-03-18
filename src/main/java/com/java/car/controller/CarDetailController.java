package com.java.car.controller;

import com.java.car.dto.CarDetailDTO;
import com.java.car.service.CarDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-details")
@CrossOrigin(origins = "http://localhost:5137")
public class CarDetailController {
    private final CarDetailService carDetailService;

    public CarDetailController(CarDetailService carDetailService) {
        this.carDetailService = carDetailService;
    }

    @GetMapping
    public List<CarDetailDTO> getAllCarDetails() {
        return carDetailService.getAllCarDetails();
    }

    @GetMapping("/model/{modelId}")
    public List<CarDetailDTO> getCarDetailsByModel(@PathVariable Integer modelId) {
        return carDetailService.getCarDetailsByModel(modelId);
    }

    @GetMapping("/category/{categoryId}")
    public List<CarDetailDTO> getCarDetailsByCategory(@PathVariable Integer categoryId) {
        return carDetailService.getCarDetailsByCategory(categoryId);
    }
}

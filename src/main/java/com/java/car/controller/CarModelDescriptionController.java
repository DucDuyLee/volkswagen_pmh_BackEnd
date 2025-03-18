package com.java.car.controller;

import com.java.car.dto.CarModelDescriptionDTO;
import com.java.car.service.CarModelDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-model-descriptions")
@CrossOrigin(origins = "*") // Cho phép frontend truy cập từ cổng khác
public class CarModelDescriptionController {
    private final CarModelDescriptionService carModelDescriptionService;

    @Autowired
    public CarModelDescriptionController(CarModelDescriptionService carModelDescriptionService) {
        this.carModelDescriptionService = carModelDescriptionService;
    }

    // Lấy tất cả mô tả xe
    @GetMapping
    public List<CarModelDescriptionDTO> getAllDescriptions() {
        return carModelDescriptionService.getAllDescriptions();
    }

    // Lấy mô tả xe theo modelId
    @GetMapping("/model/{carModelId}")
    public List<CarModelDescriptionDTO> getDescriptionsByCarModelId(@PathVariable Integer carModelId) {
        return carModelDescriptionService.getDescriptionsByCarModelId(carModelId);
    }
}

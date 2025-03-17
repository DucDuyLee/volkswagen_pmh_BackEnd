package com.java.car.controller;

import com.java.car.dto.CarParameterDTO;
import com.java.car.service.CarParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-parameters")
@CrossOrigin(origins = "*") // Cho phép frontend truy cập từ cổng khác
public class CarParameterController {
    private final CarParameterService carParameterService;

    @Autowired
    public CarParameterController(CarParameterService carParameterService) {
        this.carParameterService = carParameterService;
    }

    // API lấy tất cả thông số xe
    @GetMapping
    public List<CarParameterDTO> getAllCarParameters() {
        return carParameterService.getAllCarParameters();
    }

    // API lấy thông số xe theo modelId
    @GetMapping("/model/{modelId}")
    public List<CarParameterDTO> getCarParametersByModelId(@PathVariable Integer modelId) {
        return carParameterService.getCarParametersByModelId(modelId);
    }
}

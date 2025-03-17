package com.java.car.controller;

import com.java.car.dto.CarVersionDTO;
import com.java.car.service.CarVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-versions")
@CrossOrigin(origins = "*") // Cho phép frontend truy cập từ cổng khác
public class CarVersionController {
    private final CarVersionService carVersionService;

    @Autowired
    public CarVersionController(CarVersionService carVersionService) {
        this.carVersionService = carVersionService;
    }

    // Lấy tất cả các phiên bản xe
    @GetMapping
    public List<CarVersionDTO> getAllCarVersions() {
        return carVersionService.getAllCarVersions();
    }

    // Lấy danh sách phiên bản xe theo modelId
    @GetMapping("/model/{modelId}")
    public List<CarVersionDTO> getCarVersionsByModelId(@PathVariable Integer modelId) {
        return carVersionService.getCarVersionsByModelId(modelId);
    }
}

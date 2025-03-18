package com.java.car.controller;

import com.java.car.dto.CarDetailDescriptionDTO;
import com.java.car.service.CarDetailDescriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-detail-descriptions")
@CrossOrigin(origins = "http://localhost:5137")
public class CarDetailDescriptionController {
    private final CarDetailDescriptionService descriptionService;

    public CarDetailDescriptionController(CarDetailDescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    @GetMapping
    public List<CarDetailDescriptionDTO> getAllDescriptions() {
        return descriptionService.getAllDescriptions();
    }

    @GetMapping("/car-detail/{carDetailId}")
    public List<CarDetailDescriptionDTO> getDescriptionsByCarDetail(@PathVariable Integer carDetailId) {
        return descriptionService.getDescriptionsByCarDetail(carDetailId);
    }
}

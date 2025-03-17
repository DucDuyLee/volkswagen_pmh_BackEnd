package com.java.car.controller;

import com.java.car.dto.CarModelDTO;
import com.java.car.service.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-models")
public class CarModelController {
    @Autowired
    private CarModelService carModelService;

    @GetMapping
    public List<CarModelDTO> getAllCarModels() {
        return carModelService.getAllCarModels();
    }
}

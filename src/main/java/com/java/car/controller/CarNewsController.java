package com.java.car.controller;

import com.java.car.dto.CarNewsDTO;
import com.java.car.service.CarNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-news")
public class CarNewsController {
    @Autowired
    private CarNewsService carNewsService;

    @GetMapping
    public List<CarNewsDTO> getAllCarNews() {
        return carNewsService.getAllCarNews();
    }
}

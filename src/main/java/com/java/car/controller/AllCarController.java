package com.java.car.controller;

import com.java.car.dto.AllCarDTO;
import com.java.car.service.AllCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars") // URL chung cho các API liên quan đến xe
@CrossOrigin("*") // Cho phép gọi API từ client (có thể cấu hình cụ thể hơn)
public class AllCarController {

    @Autowired
    private AllCarService allCarService;

    @GetMapping("/all")
    public List<AllCarDTO> getAllCarData() {
        return allCarService.getAllCarData();
    }
}

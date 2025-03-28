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

    // API lấy tất cả xe
    @GetMapping("/all")
    public List<AllCarDTO> getAllCarData() {
        return allCarService.getAllCarData();
    }

    // API lấy 5 xe có giá cao nhất
    @GetMapping("/top5-expensive")
    public List<AllCarDTO> getTop5ExpensiveCars() {
        return allCarService.getTop5ExpensiveCars();
    }

    // API lấy thông tin của một xe theo id của car_version
    @GetMapping("/{carVersionId}")
    public AllCarDTO getCarByVersionId(@PathVariable Integer carVersionId) {
        return allCarService.getCarByVersionId(carVersionId);
    }
}

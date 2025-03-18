package com.java.car.service;

import com.java.car.dto.CarDetailDTO;
import com.java.car.repository.CarDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDetailService {
    private final CarDetailRepository carDetailRepository;

    public CarDetailService(CarDetailRepository carDetailRepository) {
        this.carDetailRepository = carDetailRepository;
    }

    public List<CarDetailDTO> getAllCarDetails() {
        return carDetailRepository.findAllCarDetails();
    }

    public List<CarDetailDTO> getCarDetailsByModel(Integer modelId) {
        return carDetailRepository.findCarDetailsByModel(modelId);
    }

    public List<CarDetailDTO> getCarDetailsByCategory(Integer categoryId) {
        return carDetailRepository.findCarDetailsByCategory(categoryId);
    }
}

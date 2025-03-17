package com.java.car.service;

import com.java.car.dto.CarModelDTO;
import com.java.car.repository.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarModelService {
    @Autowired
    private CarModelRepository carModelRepository;

    public List<CarModelDTO> getAllCarModels() {
        return carModelRepository.findAllCarModels();
    }
}

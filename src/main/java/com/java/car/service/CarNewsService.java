package com.java.car.service;

import com.java.car.dto.CarNewsDTO;
import com.java.car.repository.CarNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarNewsService {
    @Autowired
    private CarNewsRepository carNewsRepository;

    public List<CarNewsDTO> getAllCarNews() {
        return carNewsRepository.findAllCarNews();
    }
}

package com.java.car.service;

import com.java.car.dto.CarParameterDTO;
import com.java.car.model.CarParameter;
import com.java.car.repository.CarParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarParameterService {
    private final CarParameterRepository carParameterRepository;

    @Autowired
    public CarParameterService(CarParameterRepository carParameterRepository) {
        this.carParameterRepository = carParameterRepository;
    }

    public List<CarParameterDTO> getAllCarParameters() {
        List<CarParameter> parameters = carParameterRepository.findAll();
        return parameters.stream()
                .map(param -> new CarParameterDTO(param.getId(), param.getName(), param.getDescription()))
                .collect(Collectors.toList());
    }

    public List<CarParameterDTO> getCarParametersByModelId(Integer modelId) {
        List<CarParameter> parameters = carParameterRepository.findByCarModelId(modelId);
        return parameters.stream()
                .map(param -> new CarParameterDTO(param.getId(), param.getName(), param.getDescription()))
                .collect(Collectors.toList());
    }
}

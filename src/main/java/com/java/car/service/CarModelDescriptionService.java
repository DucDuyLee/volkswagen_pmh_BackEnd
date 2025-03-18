package com.java.car.service;

import com.java.car.dto.CarModelDescriptionDTO;
import com.java.car.model.CarModelDescription;
import com.java.car.repository.CarModelDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarModelDescriptionService {
    private final CarModelDescriptionRepository carModelDescriptionRepository;

    @Autowired
    public CarModelDescriptionService(CarModelDescriptionRepository carModelDescriptionRepository) {
        this.carModelDescriptionRepository = carModelDescriptionRepository;
    }

    public List<CarModelDescriptionDTO> getAllDescriptions() {
        List<CarModelDescription> descriptions = carModelDescriptionRepository.findAll();
        return descriptions.stream().map(description ->
                new CarModelDescriptionDTO(
                        description.getId(),
                        description.getCarModel().getId(),
                        description.getDescription()
                )
        ).collect(Collectors.toList());
    }

    public List<CarModelDescriptionDTO> getDescriptionsByCarModelId(Integer carModelId) {
        List<CarModelDescription> descriptions = carModelDescriptionRepository.findByCarModelId(carModelId);
        return descriptions.stream().map(description ->
                new CarModelDescriptionDTO(
                        description.getId(),
                        description.getCarModel().getId(),
                        description.getDescription()
                )
        ).collect(Collectors.toList());
    }
}

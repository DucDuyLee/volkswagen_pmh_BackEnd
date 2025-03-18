package com.java.car.service;

import com.java.car.dto.CarDetailDescriptionDTO;
import com.java.car.repository.CarDetailDescriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDetailDescriptionService {
    private final CarDetailDescriptionRepository descriptionRepository;

    public CarDetailDescriptionService(CarDetailDescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }

    public List<CarDetailDescriptionDTO> getAllDescriptions() {
        return descriptionRepository.findAllDescriptions();
    }

    public List<CarDetailDescriptionDTO> getDescriptionsByCarDetail(Integer carDetailId) {
        return descriptionRepository.findByCarDetailId(carDetailId);
    }
}

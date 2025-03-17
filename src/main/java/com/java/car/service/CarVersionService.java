package com.java.car.service;

import com.java.car.dto.CarVersionDTO;
import com.java.car.model.CarVersion;
import com.java.car.repository.CarVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarVersionService {
    private final CarVersionRepository carVersionRepository;

    @Autowired
    public CarVersionService(CarVersionRepository carVersionRepository) {
        this.carVersionRepository = carVersionRepository;
    }

    public List<CarVersionDTO> getAllCarVersions() {
        List<CarVersion> carVersions = carVersionRepository.findAll();
        return carVersions.stream().map(carVersion ->
                new CarVersionDTO(
                        carVersion.getId(),
                        carVersion.getName(),
                        carVersion.getPrice(),
                        carVersion.getImage(),
                        carVersion.getModel().getId()
                )
        ).collect(Collectors.toList());
    }

    public List<CarVersionDTO> getCarVersionsByModelId(Integer modelId) {
        List<CarVersion> carVersions = carVersionRepository.findByModelId(modelId);
        return carVersions.stream().map(carVersion ->
                new CarVersionDTO(
                        carVersion.getId(),
                        carVersion.getName(),
                        carVersion.getPrice(),
                        carVersion.getImage(),
                        carVersion.getModel().getId()
                )
        ).collect(Collectors.toList());
    }
}

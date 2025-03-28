package com.java.car.service;

import com.java.car.dto.*;
import com.java.car.model.CarVersion;
import com.java.car.model.CarModel;
import com.java.car.repository.CarVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllCarService {
    @Autowired
    private CarVersionRepository carVersionRepository;

    // Lấy tất cả xe
    public List<AllCarDTO> getAllCarData() {
        List<CarVersion> allCars = carVersionRepository.findAll();
        return mapToAllCarDTOList(allCars);
    }

    // Lấy 5 xe có giá cao nhất
    public List<AllCarDTO> getTop5ExpensiveCars() {
        List<CarVersion> top5Cars = carVersionRepository.findTop5ByOrderByPriceDesc();
        return mapToAllCarDTOList(top5Cars);
    }

    // Phương thức chuyển đổi danh sách CarVersion thành List<AllCarDTO>
    private List<AllCarDTO> mapToAllCarDTOList(List<CarVersion> carVersions) {
        return carVersions.stream().map(carVersion -> {
            CarModel carModel = carVersion.getModel(); // Lấy model từ phiên bản

            // Danh sách chi tiết xe
            List<CarDetailDTO> carDetailDTOs = carModel.getCarDetails().stream()
                    .map(detail -> new CarDetailDTO(
                            detail.getId(),
                            carModel.getName(),
                            detail.getCategory().getCategoryName(),
                            detail.getTitle(),
                            detail.getImage()
                    ))
                    .collect(Collectors.toList());

            // Danh sách mô tả chi tiết
            List<CarDetailDescriptionDTO> carDetailDescriptionDTOs = carModel.getCarDetails().stream()
                    .flatMap(detail -> detail.getCarDetailDescriptions().stream())
                    .map(desc -> new CarDetailDescriptionDTO(
                            desc.getId(),
                            desc.getCarDetail().getId(),
                            desc.getDescription()
                    ))
                    .collect(Collectors.toList());

            // Danh sách thông số kỹ thuật
            List<CarParameterDTO> carParameterDTOs = carModel.getCarParameters().stream()
                    .map(param -> new CarParameterDTO(
                            param.getId(),
                            param.getName(),
                            param.getDescription()
                    ))
                    .collect(Collectors.toList());

            return new AllCarDTO(
                    carVersion.getId(),
                    carVersion.getName(),
                    carVersion.getPrice(),
                    carVersion.getImage(),
                    carDetailDTOs,
                    carDetailDescriptionDTOs,
                    carParameterDTOs
            );
        }).collect(Collectors.toList());
    }
}

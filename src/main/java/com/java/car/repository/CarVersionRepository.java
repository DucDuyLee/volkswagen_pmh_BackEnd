package com.java.car.repository;

import com.java.car.model.CarVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarVersionRepository extends JpaRepository<CarVersion, Integer> {
    List<CarVersion> findByModelId(Integer modelId);
    // Lấy 5 xe có giá cao nhất
    List<CarVersion> findTop5ByOrderByPriceDesc();
}

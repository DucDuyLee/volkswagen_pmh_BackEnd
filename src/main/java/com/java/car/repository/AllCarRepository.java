package com.java.car.repository;

import com.java.car.model.CarVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AllCarRepository extends JpaRepository<CarVersion, Integer>  {
//    List<CarVersion> findByModelId(Integer modelId);
    @Query(value = "SELECT * FROM car_versions ORDER BY price DESC LIMIT 5", nativeQuery = true)
    List<CarVersion> findTop5ByPriceNative();

}

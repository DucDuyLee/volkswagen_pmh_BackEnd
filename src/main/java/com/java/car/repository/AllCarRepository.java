package com.java.car.repository;

import com.java.car.model.CarVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AllCarRepository extends JpaRepository<CarVersion, Integer>  {
    List<CarVersion> findByModelId(Integer modelId);
}

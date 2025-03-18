package com.java.car.repository;

import com.java.car.model.CarModelDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarModelDescriptionRepository extends JpaRepository<CarModelDescription, Integer> {
    List<CarModelDescription> findByCarModelId(Integer carModelId);
}

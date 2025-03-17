package com.java.car.repository;

import com.java.car.model.CarParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarParameterRepository extends JpaRepository<CarParameter, Integer> {
    List<CarParameter> findByCarModelId(Integer carModelId);
}

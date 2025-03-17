package com.java.car.repository;

import com.java.car.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CarModelRepository extends JpaRepository<CarModel, Integer> {
    @Query("SELECT new com.java.car.dto.CarModelDTO(c.id, c.name, c.basePrice, c.image) FROM CarModel c")
    List<com.java.car.dto.CarModelDTO> findAllCarModels();
}

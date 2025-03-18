package com.java.car.repository;

import com.java.car.dto.CarDetailDescriptionDTO;
import com.java.car.model.CarDetailDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarDetailDescriptionRepository extends JpaRepository<CarDetailDescription, Integer> {

    @Query("SELECT new com.java.car.dto.CarDetailDescriptionDTO(d.id, d.carDetail.id, d.description) FROM CarDetailDescription d")
    List<CarDetailDescriptionDTO> findAllDescriptions();

    @Query("SELECT new com.java.car.dto.CarDetailDescriptionDTO(d.id, d.carDetail.id, d.description) " +
            "FROM CarDetailDescription d " +
            "WHERE d.carDetail.id = :carDetailId")
    List<CarDetailDescriptionDTO> findByCarDetailId(@Param("carDetailId") Integer carDetailId);
}

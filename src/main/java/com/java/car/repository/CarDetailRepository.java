package com.java.car.repository;

import com.java.car.dto.CarDetailDTO;
import com.java.car.model.CarDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CarDetailRepository extends JpaRepository<CarDetail, Integer> {

    @Query("SELECT new com.java.car.dto.CarDetailDTO(cd.id, cm.name, cdc.categoryName, cd.title, cd.image) " +
            "FROM CarDetail cd " +
            "JOIN cd.model cm " +
            "JOIN cd.category cdc")
    List<CarDetailDTO> findAllCarDetails();

    @Query("SELECT new com.java.car.dto.CarDetailDTO(cd.id, cm.name, cdc.categoryName, cd.title, cd.image) " +
            "FROM CarDetail cd " +
            "JOIN cd.model cm " +
            "JOIN cd.category cdc " +
            "WHERE cm.id = :modelId")
    List<CarDetailDTO> findCarDetailsByModel(@Param("modelId") Integer modelId);

    @Query("SELECT new com.java.car.dto.CarDetailDTO(cd.id, cm.name, cdc.categoryName, cd.title, cd.image) " +
            "FROM CarDetail cd " +
            "JOIN cd.model cm " +
            "JOIN cd.category cdc " +
            "WHERE cdc.id = :categoryId")
    List<CarDetailDTO> findCarDetailsByCategory(@Param("categoryId") Integer categoryId);
}

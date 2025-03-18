package com.java.car.repository;

import com.java.car.dto.CarDetailCategoryDTO;
import com.java.car.model.CarDetailCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDetailCategoryRepository extends JpaRepository<CarDetailCategory, Integer> {

    @Query("SELECT new com.java.car.dto.CarDetailCategoryDTO(c.id, c.categoryName) FROM CarDetailCategory c")
    List<CarDetailCategoryDTO> findAllCategories();
}

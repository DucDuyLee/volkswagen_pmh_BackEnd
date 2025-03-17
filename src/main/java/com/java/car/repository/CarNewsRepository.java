package com.java.car.repository;

import com.java.car.dto.CarNewsDTO;
import com.java.car.model.CarNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CarNewsRepository extends JpaRepository<CarNews, Integer> {
    @Query("SELECT new com.java.car.dto.CarNewsDTO(n.id, n.title, n.content, n.image, n.link) FROM CarNews n")
    List<CarNewsDTO> findAllCarNews();
}

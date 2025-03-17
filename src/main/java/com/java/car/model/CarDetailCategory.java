package com.java.car.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_details_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDetailCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 255)
    private String categoryName;
}


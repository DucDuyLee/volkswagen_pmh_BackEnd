package com.java.car.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_model_descriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarModelDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "car_model_id", nullable = false)
    private CarModel carModel;

    @Column(nullable = false, length = 1000)
    private String description;
}


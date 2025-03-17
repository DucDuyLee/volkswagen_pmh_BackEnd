package com.java.car.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private CarModel model;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CarDetailCategory category;

    @Column(nullable = false, length = 1000)
    private String title;

    private String image;
}


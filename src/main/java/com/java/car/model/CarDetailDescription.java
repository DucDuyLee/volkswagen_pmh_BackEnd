package com.java.car.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_detail_descriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDetailDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "car_detail_id", nullable = false)
    private CarDetail carDetail;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
}

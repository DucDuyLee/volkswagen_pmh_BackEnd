package com.java.car.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_news")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 1055)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    private String image;

    private String link;
}

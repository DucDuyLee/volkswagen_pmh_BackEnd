package com.java.car.model;

import jakarta.persistence.*;

@Entity
@Table(name = "car_detail_descriptions")
public class CarDetailDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "car_detail_id", nullable = false)
    private CarDetail carDetail;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    public CarDetailDescription() {}

    public CarDetailDescription(Integer id, CarDetail carDetail, String description) {
        this.id = id;
        this.carDetail = carDetail;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarDetail getCarDetail() {
        return carDetail;
    }

    public void setCarDetail(CarDetail carDetail) {
        this.carDetail = carDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

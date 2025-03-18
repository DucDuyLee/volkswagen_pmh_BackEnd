package com.java.car.model;

import jakarta.persistence.*;

@Entity
@Table(name = "car_model_descriptions")
public class CarModelDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "car_model_id", nullable = false)
    private CarModel carModel;

    @Column(nullable = false, length = 1000)
    private String description;

    // Constructor không tham số
    public CarModelDescription() {}

    // Constructor có tham số
    public CarModelDescription(Integer id, CarModel carModel, String description) {
        this.id = id;
        this.carModel = carModel;
        this.description = description;
    }

    // Getter và Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

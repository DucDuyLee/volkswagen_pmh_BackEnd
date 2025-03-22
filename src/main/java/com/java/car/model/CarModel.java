package com.java.car.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_models")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @Column(name = "base_price", nullable = false, length = 100)
    private String basePrice;

    private String image;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CarVersion> versions;

    // Constructor không tham số
    public CarModel() {}

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CarDetail> carDetails;

    @OneToMany(mappedBy = "carModel", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CarParameter> carParameters;

    public List<CarDetail> getCarDetails() {
        return carDetails;
    }

    public List<CarParameter> getCarParameters() {
        return carParameters;
    }


    // Constructor đầy đủ tham số
    public CarModel(Integer id, String name, String basePrice, String image, List<CarVersion> versions) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.image = image;
        this.versions = versions;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public String getImage() {
        return image;
    }

    public List<CarVersion> getVersions() {
        return versions;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVersions(List<CarVersion> versions) {
        this.versions = versions;
    }
}

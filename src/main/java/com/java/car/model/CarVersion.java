package com.java.car.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "car_versions")
public class CarVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private CarModel model;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal price;

    private String image;

    // Constructor không tham số
    public CarVersion() {}

    // Constructor có tham số
    public CarVersion(Integer id, CarModel model, String name, BigDecimal price, String image) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // Getter và Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

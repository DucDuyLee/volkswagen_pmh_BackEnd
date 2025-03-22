package com.java.car.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "car_details")
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

    public CarDetail() {}

    @OneToMany(mappedBy = "carDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarDetailDescription> carDetailDescriptions;

    public List<CarDetailDescription> getCarDetailDescriptions() {
        return carDetailDescriptions;
    }


    public CarDetail(Integer id, CarModel model, CarDetailCategory category, String title, String image) {
        this.id = id;
        this.model = model;
        this.category = category;
        this.title = title;
        this.image = image;
    }

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

    public CarDetailCategory getCategory() {
        return category;
    }

    public void setCategory(CarDetailCategory category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

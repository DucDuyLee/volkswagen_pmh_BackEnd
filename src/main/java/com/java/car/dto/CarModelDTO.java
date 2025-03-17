package com.java.car.dto;

public class CarModelDTO {
    private Integer id;
    private String name;
    private String basePrice;
    private String image;

    public CarModelDTO(Integer id, String name, String basePrice, String image) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.image = image;
    }

    // Getter và Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

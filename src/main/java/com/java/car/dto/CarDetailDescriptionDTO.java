package com.java.car.dto;

public class CarDetailDescriptionDTO {
    private Integer id;
    private Integer carDetailId;
    private String description;

    public CarDetailDescriptionDTO(Integer id, Integer carDetailId, String description) {
        this.id = id;
        this.carDetailId = carDetailId;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarDetailId() {
        return carDetailId;
    }

    public void setCarDetailId(Integer carDetailId) {
        this.carDetailId = carDetailId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

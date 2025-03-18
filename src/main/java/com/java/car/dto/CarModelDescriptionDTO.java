package com.java.car.dto;

public class CarModelDescriptionDTO {
    private Integer id;
    private Integer carModelId; // Chỉ lấy ID của CarModel thay vì toàn bộ object
    private String description;

    public CarModelDescriptionDTO(Integer id, Integer carModelId, String description) {
        this.id = id;
        this.carModelId = carModelId;
        this.description = description;
    }

    // Getter và Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(Integer carModelId) {
        this.carModelId = carModelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

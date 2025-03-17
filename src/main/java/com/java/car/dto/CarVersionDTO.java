package com.java.car.dto;

import java.math.BigDecimal;

public class CarVersionDTO {
    private Integer id;
    private String name;
    private BigDecimal price;
    private String image;
    private Integer modelId; // Chỉ lấy ID của CarModel thay vì toàn bộ đối tượng

    public CarVersionDTO(Integer id, String name, BigDecimal price, String image, Integer modelId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.modelId = modelId;
    }

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

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }
}

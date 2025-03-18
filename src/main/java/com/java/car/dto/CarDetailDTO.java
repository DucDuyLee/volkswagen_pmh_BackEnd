package com.java.car.dto;

public class CarDetailDTO {
    private Integer id;
    private String modelName;
    private String categoryName;
    private String title;
    private String image;

    public CarDetailDTO(Integer id, String modelName, String categoryName, String title, String image) {
        this.id = id;
        this.modelName = modelName;
        this.categoryName = categoryName;
        this.title = title;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

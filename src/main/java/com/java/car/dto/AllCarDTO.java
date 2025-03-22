package com.java.car.dto;

import java.math.BigDecimal;
import java.util.List;

public class AllCarDTO {
    private Integer id;
    private String name;
    private BigDecimal price;
    private String image;
    private List<CarDetailDTO> carDetails;
    private List<CarDetailCategoryDTO> carDetailCategories;
    private List<CarDetailDescriptionDTO> carDetailDescriptions;
    private List<CarParameterDTO> carParameters;

    // Constructors
    public AllCarDTO() {}

    public AllCarDTO(Integer id, String name, BigDecimal price, String image,
                     List<CarDetailDTO> carDetails,
                     List<CarDetailDescriptionDTO> carDetailDescriptions,
                     List<CarParameterDTO> carParameters) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.carDetails = carDetails;
        this.carDetailDescriptions = carDetailDescriptions;
        this.carParameters = carParameters;
    }


    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public List<CarDetailDTO> getCarDetails() { return carDetails; }
    public void setCarDetails(List<CarDetailDTO> carDetails) { this.carDetails = carDetails; }

    public List<CarDetailCategoryDTO> getCarDetailCategories() { return carDetailCategories; }
    public void setCarDetailCategories(List<CarDetailCategoryDTO> carDetailCategories) { this.carDetailCategories = carDetailCategories; }

    public List<CarDetailDescriptionDTO> getCarDetailDescriptions() { return carDetailDescriptions; }
    public void setCarDetailDescriptions(List<CarDetailDescriptionDTO> carDetailDescriptions) { this.carDetailDescriptions = carDetailDescriptions; }

    public List<CarParameterDTO> getCarParameters() { return carParameters; }
    public void setCarParameters(List<CarParameterDTO> carParameters) { this.carParameters = carParameters; }
}

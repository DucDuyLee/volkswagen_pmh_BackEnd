package com.java.car.dto;

public class CarNewsDTO {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private String link;

    public CarNewsDTO(Integer id, String title, String content, String image, String link) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.link = link;
    }

    // Getters và Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

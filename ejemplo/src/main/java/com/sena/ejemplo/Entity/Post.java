package com.sena.ejemplo.Entity;

import jakarta.persistence.Column;

public class Post extends ABaseEntity{
    @Column(name = "text", length = 50, nullable = false)
    private String text;

    @Column(name = "image", length = 50, nullable = false)
    private String image;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

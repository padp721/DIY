package com.example.diy;

public class ArticleModel {

    private String name;
    private int image;

    public ArticleModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;

    }
}

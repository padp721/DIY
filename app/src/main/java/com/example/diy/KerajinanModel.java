package com.example.diy;

public class KerajinanModel {

    private String name, year, desc;
    private int image;

    public KerajinanModel(String name, String year, String desc, int image) {
        this.name = name;
        this.year = year;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }


}

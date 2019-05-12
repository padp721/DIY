package com.example.diy;

public class Artikel {

    private String Tittle;
    private String Category;
    private String Description;
    private String Tgl;
    private String Thumbnail;

    public Artikel(){

    }

    public Artikel(String tittle, String category, String description, String tgl, String thumbnail) {
        Tittle = tittle;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Tgl = tgl;
    }

    public String getTgl() {
        return Tgl;
    }

    public void setTgl(String tgl) {
        Tgl = tgl;
    }


    public String getTittle() {
        return Tittle;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }
}

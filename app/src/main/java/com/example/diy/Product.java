package com.example.diy;

import java.util.ArrayList;

public class Product implements Comparable<Product>{
    private int trending;
    private String name, remarks, photo;
    private ArrayList<String> tahapan = new ArrayList<>();
    private ArrayList<String> material = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ArrayList<String> getTahapan() {
        return tahapan;
    }

    public void setTahapan(ArrayList<String> tahapan) {
        this.tahapan = tahapan;
    }

    public ArrayList<String> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<String> material) {
        this.material = material;
    }

    public int getTrending() {
        return trending;
    }

    public void setTrending(int trending) {
        this.trending = trending;
    }

    @Override
    public int compareTo(Product compareProduct) {

        int compareTrending = ((Product)compareProduct).getTrending();

        return compareTrending - this.trending;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

}

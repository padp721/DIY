package com.example.diy;

import java.util.ArrayList;

public class Product {
    private String name, remarks, photo;
    private ArrayList<String> tahapan = new ArrayList<>();

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
}

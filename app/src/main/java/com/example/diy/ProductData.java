package com.example.diy;

import java.util.ArrayList;

public class ProductData {
    public static String[][] data = new String[][]{
            {"Gantungan Kunci Polimer Clay", "4 April 2019", "https://images.homify.com/image/upload/c_scale,h_423,q_auto,f_jpg/v1532333213/pk9mbgywmb4wf9nwe9jo.jpg"},
            {"Pot Gantung", "4 April 2019", "https://images.homify.com/image/upload/c_scale,h_423,q_auto,f_jpg/v1538751601/nsbjvxemzitqmf2gjltu.jpg"},
            {"Mini Pallet", "3 April 2019", "https://washitapecrafts.com/wp-content/uploads/2014/07/Mini-Pallet-Coasters.jpg"},
            {"Preety Pen Pots", "3 April 2019", "https://www.thespruce.com/thmb/tyyP2PCApM7TYs8oFpQn2yT0sBQ=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/home-organizing-hacks-cover-591dbc2b5f9b58f4c04a569c.jpg"},
            {"Tin Can Luminaries", "3 April 2019", "http://blog.consumercrafts.com/wp-content/uploads/2014/04/Tin-can-crafts-luminaries-Crafts-Unleashed.jpg"},
            {"Soap DIY", "2 April 2019", "https://images.homify.com/image/upload/c_scale,h_423,q_auto,f_jpg/v1533033954/nje4xjt6uyytmobhexkk.jpg"}
    };

    public static ArrayList<Product> getListData(){
        Product product = null;
        ArrayList<Product> list = new ArrayList<>();
        for (String[] aData : data) {
            product = new Product();
            product.setName(aData[0]);
            product.setRemarks(aData[1]);
            product.setPhoto(aData[2]);

            list.add(product);
        }

        return list;
    }
}

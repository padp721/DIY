package com.example.diy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DiscoveryMain extends AppCompatActivity {

    private ArrayList<Product> lsProduk = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discovery);

        lsProduk.addAll(ProductData.getListData());

        RecyclerView produkrv = findViewById(R.id.produk_list);
        DiscoveryAdapter produkAdapter = new DiscoveryAdapter(this);
        produkAdapter.setListDiscover((ArrayList<Product>) lsProduk);
        produkrv.setLayoutManager(new GridLayoutManager(this, 3));
        produkrv.setAdapter(produkAdapter);



    }
}

package com.example.diy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class NewProduct extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Product> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerajinan_full_list);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(ProductData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListProductAdapter listProductAdapter = new ListProductAdapter(this);
        listProductAdapter.setListProduct(list);
        rvCategory.setAdapter(listProductAdapter);
    }
}

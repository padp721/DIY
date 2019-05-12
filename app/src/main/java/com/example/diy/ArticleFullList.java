package com.example.diy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArticleFullList  extends AppCompatActivity {


    private ArrayList<Artikel> lstArtikel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_list_full);

        lstArtikel.addAll(ArtikelData.getListData());

        RecyclerView myrv = findViewById(R.id.recyclerView);
        ListArtikelAdapter MyAdapter = new ListArtikelAdapter(this);
        MyAdapter.setListProduct(lstArtikel);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(MyAdapter);
    }
}

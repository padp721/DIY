package com.example.diy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleFullList extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Artikel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_list_full);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(ArtikelData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListArtikelAdapter listArtikelAdapter = new ListArtikelAdapter(this);
        listArtikelAdapter.setListArtikel(list);
        rvCategory.setAdapter(listArtikelAdapter);
    }

}
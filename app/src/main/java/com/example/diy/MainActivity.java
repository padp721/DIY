package com.example.diy;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView kerajinan,trending,article;
    KerajinanAdapter Kadapter;
    TrendingAdapter Tadapter;
    ArticleAdapter Aadapter;

    List<KerajinanModel> kerajinanList;
    List<TrendingModel> trendingList;
    List<ArticleModel> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kerajinanList = new ArrayList<>();
        trendingList = new ArrayList<>();
        articleList = new ArrayList<>();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        kerajinan = (RecyclerView) findViewById(R.id.kerajinan);
        trending = (RecyclerView) findViewById(R.id.trending);
        article = (RecyclerView) findViewById(R.id.article);
        showList();
    }

    private void kerajinan(){
        kerajinanList.clear();
        kerajinanList.add(
                new KerajinanModel(
                        "PGC10/KPGC10 Skyline GT-R",
                        "1969–1972",
                        "The first Skyline GT-R, known by the internal Nissan designation PGC10, was released on 4 February 1969, and was exclusive to Japanese Nissan dealership network called Nissan Prince Store when the Prince company was integrated into Nissan operations in 1966.",
                        R.drawable.aa));

        kerajinanList.add(
                new KerajinanModel(
                        "KPGC110 Skyline GT-R",
                        "1973",
                        "The KPGC10's successor, the KPGC110, was released in 1973 after its introduction at the 1972 Tokyo Motor Show. Powered by a 1989 cc I6 S20 engine, the second generation GT-R delivered power to the rear wheels through a 5-speed manual gearbox.",
                        R.drawable.bb));

        kerajinanList.add(
                new KerajinanModel(
                        "Nissan Skyline GTR R32",
                        "1989–1994",
                        "The R32 Skyline debuted in 1989. It was available as either a 2-door coupe or 4-door hardtop sedan.",
                        R.drawable.cc));

        kerajinanList.add(
                new KerajinanModel(
                        "Nissan Skyline GTR R33",
                        "1995–1998",
                        "The E-BCNR33 (R33) was developed in 1995 as a successor to the R32 model. The engine in the R33 was nearly identical to the R32. It used the same turbochargers and the same specification for the manual gearbox, although the syncros were stronger.",
                        R.drawable.dd));
    }

    private void trending(){
        trendingList.clear();
        trendingList.add(
                new TrendingModel(
                        "PGC10/KPGC10 Skyline GT-R",
                        R.drawable.aa));

        trendingList.add(
                new TrendingModel(
                        "KPGC110 Skyline GT-R",
                        R.drawable.bb));

        trendingList.add(
                new TrendingModel(
                        "Nissan Skyline GTR R32",
                        R.drawable.cc));

        trendingList.add(
                new TrendingModel(
                        "Nissan Skyline GTR R33",
                        R.drawable.dd));
    }

    private void article(){
        articleList.clear();
        articleList.add(
                new ArticleModel(
                        "Kerajinan Tangan Motif Manik-manik Khas Suku Dayak Tamambalo",
                        R.drawable.a));

        articleList.add(
                new ArticleModel(
                        "Peserta Pelatihan Kerajinan Tangan Diharapkan Jadi Penggerak Ekonomi Desa",
                        R.drawable.b));

        articleList.add(
                new ArticleModel(
                        "Limbah Kulit Sagu Disulap Menjadi Berbagai Kerajinan Tangan",
                        R.drawable.c));

        articleList.add(
                new ArticleModel(
                        "Ekspor Produk Kerajinan Tangan RI Naik 4 Kali Lipat Dalam 20 Tahun",
                        R.drawable.d));
    }

    private void showList(){
        kerajinan.setLayoutManager(new LinearLayoutManager(this));
        trending.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false));
        article.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false));
        kerajinan();
        trending();
        article();
        Kadapter = new KerajinanAdapter(this, kerajinanList);
        Tadapter = new TrendingAdapter(this, trendingList);
        Aadapter = new ArticleAdapter(this, articleList);
        kerajinan.setAdapter(Kadapter);
        trending.setAdapter(Tadapter);
        article.setAdapter(Aadapter);
    }

}

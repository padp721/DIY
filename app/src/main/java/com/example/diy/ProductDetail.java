package com.example.diy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProductDetail extends AppCompatActivity {

    RecyclerView recyclerView;
    StepsAdapter adapter;
    private static final String TAG = "ViewDetail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);
        Log.d(TAG, "onCreate: started");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("tgl") && getIntent().hasExtra("nama")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String productImage = getIntent().getStringExtra("photo");
            String productName = getIntent().getStringExtra("nama");
            String productDate = getIntent().getStringExtra("tgl");
            ArrayList<String> productStep = (ArrayList<String>) getIntent().getSerializableExtra("step");

            Log.d(TAG, String.valueOf(productStep));

            setImage(productImage, productName, productDate, productStep);
        }
    }

    private void setImage(String productImage, String productName, String productDate, ArrayList<String> productStep){
        TextView name = findViewById(R.id.name);
        name.setText(productName);

        ImageView image = findViewById(R.id.image);
        Glide.with(this).load(productImage).into(image);

        TextView tgl = findViewById(R.id.tgl);
        tgl.setText(productDate);

        recyclerView = (RecyclerView) findViewById(R.id.langkah);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StepsAdapter(this, productStep);
        recyclerView.setAdapter(adapter);
    }
}

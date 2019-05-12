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

    RecyclerView recyclerViewS, recyclerViewM;
    StepsAdapter adapterS;
    MaterialAdapter adapterM;
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

            int productImage = getIntent().getExtras().getInt("photo");
            String productName = getIntent().getStringExtra("nama");
            String productDate = getIntent().getStringExtra("tgl");
            ArrayList<String> productStep = (ArrayList<String>) getIntent().getSerializableExtra("step");
            ArrayList<String> productMaterial = (ArrayList<String>) getIntent().getSerializableExtra("material");

            Log.d(TAG, String.valueOf(productStep));

            setImage(productImage, productName, productDate, productStep, productMaterial);
        }
    }

    private void setImage(int productImage, String productName, String productDate, ArrayList<String> productStep, ArrayList<String> productMaterial){
        TextView name = findViewById(R.id.name);
        name.setText(productName);

        ImageView image = findViewById(R.id.image);
        Glide.with(this).load(productImage).into(image);

        TextView tgl = findViewById(R.id.tgl);
        tgl.setText(productDate);

        recyclerViewS = (RecyclerView) findViewById(R.id.langkah);
        recyclerViewM = (RecyclerView) findViewById(R.id.material);
        recyclerViewS.setHasFixedSize(true);
        recyclerViewM.setHasFixedSize(true);
        recyclerViewS.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewM.setLayoutManager(new LinearLayoutManager(this));
        adapterS = new StepsAdapter(this, productStep);
        adapterM = new MaterialAdapter(this, productMaterial);
        recyclerViewS.setAdapter(adapterS);
        recyclerViewM.setAdapter(adapterM);
    }
}

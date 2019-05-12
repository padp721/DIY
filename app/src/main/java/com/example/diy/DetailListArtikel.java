package com.example.diy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailListArtikel  extends AppCompatActivity {
    private TextView tvtitle, tvdescribtion, tvcategory, tvtgl;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_artikel);

        tvtitle = findViewById(R.id.txtittle);
        tvdescribtion = findViewById(R.id.txtDesc);
        tvcategory = findViewById(R.id.txtCat);
        tvtgl = findViewById(R.id.txttgl);
        img = findViewById(R.id.artikelthumbnail);

        //Receive Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Category = intent.getExtras().getString("Category");
        String Tgl = intent.getExtras().getString("Tgl");
        int image = intent.getExtras().getInt("Thumbnail");

        //

        tvtitle.setText(Title);
        tvdescribtion.setText(Description);
        tvcategory.setText(Category);
        tvtgl.setText(Tgl);
        img.setImageResource(image);

    }
}

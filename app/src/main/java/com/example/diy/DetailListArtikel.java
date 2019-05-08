package com.example.diy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailListArtikel extends AppCompatActivity {
    TextView txtName, des, pub;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_artikel);

        txtName=findViewById(R.id.name);
        des=findViewById(R.id.remarks);
        pub=findViewById(R.id.tanggal);
        image=findViewById(R.id.gambar);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String remarks= i.getStringExtra("remarks");
        String tanggal= i.getStringExtra("tanggal");
        String gambar = i.getStringExtra("gambar");

        txtName.setText(name);
        des.setText(remarks);
        pub.setText(tanggal);
        Glide.with(this)
                .load(gambar)
                .apply(new RequestOptions())
                .into(image);
    }

}

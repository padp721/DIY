package com.example.diy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class KerajinanAdapter extends RecyclerView.Adapter<KerajinanAdapter.KerajinanViewHolder> {

    private Context Ctx;
    private ArrayList<Product> kerajianList;

    public KerajinanAdapter(Context Ctx) {
        this.Ctx = Ctx;
    }

    private ArrayList<Product> getKerajinanList() {
        return kerajianList;
    }

    void setListProduct(ArrayList<Product> kerajinanList) {
        this.kerajianList = kerajinanList;
    }

    @NonNull
    @Override
    public KerajinanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.kerajinan_list, null);
        return new KerajinanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KerajinanViewHolder kerajinanViewHolder, int i) {
        final Product kerajinan = kerajianList.get(i);

        kerajinanViewHolder.textViewYear.setText(kerajinan.getRemarks());
        kerajinanViewHolder.textViewName.setText(kerajinan.getName());

        Glide.with(Ctx)
                .load(getKerajinanList().get(i).getPhoto())
                .into(kerajinanViewHolder.imageView);


//        gtrViewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mCtx, gtr.getName(), Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(mCtx, ViewDetail.class);
//                intent.putExtra("image_url", gtr.getImage());
//                intent.putExtra("image_name", gtr.getName());
//                intent.putExtra("image_desc", gtr.getDesc());
//                mCtx.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {

        return 3;
    }

    class KerajinanViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName, textViewYear;
        LinearLayout parentLayout;

        public KerajinanViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.name);
            textViewYear = itemView.findViewById(R.id.year);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

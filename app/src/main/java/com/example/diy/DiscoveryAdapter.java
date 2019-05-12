package com.example.diy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class DiscoveryAdapter  extends RecyclerView.Adapter<DiscoveryAdapter.MyViewHolder>{

    private Context mContext;
    private ArrayList<Product> mData;

    public DiscoveryAdapter(Context Ctx) {
        this.mContext = Ctx;
    }

    private ArrayList<Product> getDiscoveryList() {
        return mData;
    }

    void setListDiscover(ArrayList<Product> kerajinanList) {
        this.mData = kerajinanList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.discovery_list, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Product kerajinan = mData.get(position);

        holder.produkName.setText(mData.get(position).getName());
        Glide.with(mContext)
                .load(getDiscoveryList().get(position).getPhoto())
                .into(holder.produkImg);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, ProductDetail.class);
                intent.putExtra("nama", kerajinan.getName());
                intent.putExtra("photo", kerajinan.getPhoto());
                intent.putExtra("tgl", kerajinan.getRemarks());
                intent.putExtra("step", kerajinan.getTahapan());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView produkName;
        ImageView produkImg;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            produkName = itemView.findViewById(R.id.produk_title);
            produkImg = itemView.findViewById(R.id.produk_img);
            cardView = itemView.findViewById(R.id.parent);
        }
    }
}

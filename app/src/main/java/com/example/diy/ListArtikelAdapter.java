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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListArtikelAdapter extends RecyclerView.Adapter<ListArtikelAdapter.ImageViewHolder>{

    private Context mContext;
    private ArrayList<Artikel> mData = new ArrayList<>();

    public ListArtikelAdapter(Context Ctx) {
        this.mContext = Ctx;
    }

    private ArrayList<Artikel> getArtikelList() {
        return mData;
    }

    void setListProduct(ArrayList<Artikel> artikelList) {
        this.mData = artikelList;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_row_article, parent, false);
        return new ImageViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position) {

        holder.JudulArtikel.setText(mData.get(position).getTittle());
        holder.GambarArtikel.setImageResource(Integer.parseInt(mData.get(position).getThumbnail()));

        //set click listener
        holder.artikelList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passing data to the artikel activity
                Intent intent = new Intent(mContext, DetailListArtikel.class);
                intent.putExtra("Title", mData.get(position).getTittle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", Integer.parseInt(mData.get(position).getThumbnail()));
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Tgl", mData.get(position).getTgl());


                //start the activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView GambarArtikel;
        TextView JudulArtikel;
        LinearLayout artikelList;

        public ImageViewHolder(View itemView) {
            super(itemView);
            GambarArtikel = itemView.findViewById(R.id.artikel_gmbr);
            JudulArtikel = itemView.findViewById(R.id.judul);
            artikelList = itemView.findViewById(R.id.artikel_list);

        }
    }
}
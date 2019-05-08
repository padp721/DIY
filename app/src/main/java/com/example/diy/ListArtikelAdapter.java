package com.example.diy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListArtikelAdapter extends RecyclerView.Adapter<ListArtikelAdapter.CategoryViewHolder> {

    public ListArtikelAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Artikel> getListArtikel() {
        return listArtikel;
    }

    public void setListArtikel(ArrayList<Artikel> listArtikel) {
        this.listArtikel = listArtikel;
    }

    private ArrayList<Artikel> listArtikel;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_article, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListArtikel().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListArtikel().get(position).getRemarks());
        categoryViewHolder.tvTanggal.setText(getListArtikel().get(position).getTanggal());
        Glide.with(context)
                .load(getListArtikel().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListArtikel().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        TextView tvTanggal;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            tvTanggal = itemView.findViewById(R.id.tv_item_tanggal);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

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

import java.util.List;

public class KerajinanAdapter extends RecyclerView.Adapter<KerajinanAdapter.KerajinanViewHolder> {

    private Context Ctx;
    private List<KerajinanModel> kerajianList;

    public KerajinanAdapter(Context Ctx, List<KerajinanModel> kerajianList) {
        this.Ctx = Ctx;
        this.kerajianList = kerajianList;
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
        final KerajinanModel kerajinan = kerajianList.get(i);

        kerajinanViewHolder.textViewYear.setText(kerajinan.getYear());
        kerajinanViewHolder.textViewName.setText(kerajinan.getName());

        kerajinanViewHolder.imageView.setImageDrawable(Ctx.getResources().getDrawable(kerajinan.getImage()));

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

package com.example.diy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MaterialAdapter extends RecyclerView.Adapter<MaterialAdapter.MaterialViewHolder> {

    private Context Ctx;
    private List<String> materialList;

    public MaterialAdapter(Context Ctx, List<String> materialList) {
            this.Ctx = Ctx;
            this.materialList = materialList;
            }

    @NonNull
    @Override
    public MaterialViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(Ctx);
            View view = inflater.inflate(R.layout.row_material, null);
            return new MaterialViewHolder(view);
            }

    @Override
    public void onBindViewHolder(@NonNull MaterialViewHolder materialViewHolder, int i) {

        materialViewHolder.material.setText(materialList.get(i));


            }

    @Override
    public int getItemCount() {
            return materialList.size();
            }

    public class MaterialViewHolder extends RecyclerView.ViewHolder {

        TextView material, no;

        public MaterialViewHolder(@NonNull View itemView) {
            super(itemView);

            material = itemView.findViewById(R.id.materials);

        }
    }
}
package com.example.diy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.TrendingViewHolder> {

    private Context Ctx;
    private ArrayList<Product> trendingList;

    public TrendingAdapter(Context Ctx) {
        this.Ctx = Ctx;
    }

    private ArrayList<Product> getTrendingList() {
        return trendingList;
    }

    void setListProduct(ArrayList<Product> trendingList) {
        this.trendingList = trendingList;
    }

    @NonNull
    @Override
    public TrendingAdapter.TrendingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.trending_list, null);
        return new TrendingAdapter.TrendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingAdapter.TrendingViewHolder trendingViewHolder, int i) {
        final Product kerajinan = trendingList.get(i);

        trendingViewHolder.textViewName.setText(kerajinan.getName());

        Glide.with(Ctx)
                .load(getTrendingList().get(i).getPhoto())
                .into(trendingViewHolder.imageView);

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

        return trendingList.size();
    }

    class TrendingViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName;
        LinearLayout parentLayout;

        public TrendingViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

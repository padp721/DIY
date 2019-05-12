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

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {

    private Context Ctx;
    private ArrayList<Artikel> articleList;

    public ArticleAdapter(Context Ctx) {
        this.Ctx = Ctx;
    }

    private ArrayList<Artikel> getArtikelList() {
        return articleList;
    }

    void setListProduct(ArrayList<Artikel> artikelList) {
        this.articleList = artikelList;
    }

    @NonNull
    @Override
    public ArticleAdapter.ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.article_list, null);
        return new ArticleAdapter.ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleAdapter.ArticleViewHolder articleViewHolder, int i) {
        final Artikel article = articleList.get(i);

        articleViewHolder.textViewName.setText(article.getName());

        Glide.with(Ctx)
                .load(getArtikelList().get(i).getPhoto())
                .into(articleViewHolder.imageView);

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

        return articleList.size();
    }

    class ArticleViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName;
        LinearLayout parentLayout;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

}

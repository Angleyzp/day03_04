package com.example.day03_04.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.day03_04.Conctract.Contract;
import com.example.day03_04.R;
import com.example.day03_04.bean.NewsBean;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<NewsBean.NewsDTO> list;

    public Adapter(Context context, ArrayList<NewsBean.NewsDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recy, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tv_text.setText(list.get(position).getTile());
        Glide.with(context).load(list.get(position).getImageUrl()).into(viewHolder.iv_image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv_image;
        private final TextView tv_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.iv_image);
            tv_text = itemView.findViewById(R.id.tv_title);
        }
    }
}

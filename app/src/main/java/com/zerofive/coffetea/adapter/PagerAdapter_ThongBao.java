package com.zerofive.coffetea.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zerofive.coffetea.R;

public class PagerAdapter_ThongBao extends RecyclerView.Adapter<PagerAdapter_ThongBao.ViewHolder>{


    int[] images;

    public PagerAdapter_ThongBao(int[] images) {
        this.images = images;
    }


    @NonNull
    @Override
    public PagerAdapter_ThongBao.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_thongbao, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PagerAdapter_ThongBao.ViewHolder holder, int position) {
        holder.img_thongbao.setBackgroundResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_thongbao;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_thongbao = itemView.findViewById(R.id.img_thongbao);
        }
    }

}

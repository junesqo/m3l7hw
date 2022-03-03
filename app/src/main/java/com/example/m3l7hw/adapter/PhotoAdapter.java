package com.example.m3l7hw.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3l7hw.R;
import com.example.m3l7hw.databinding.PhotoItemBinding;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder> {
    private ArrayList<Integer> photos;

    public PhotoAdapter(ArrayList<Integer> photos) {
        this.photos = photos;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhotoViewHolder(PhotoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        holder.bind(photos.get(position));
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    class PhotoViewHolder extends RecyclerView.ViewHolder {
        private PhotoItemBinding binding;
        public PhotoViewHolder(@NonNull PhotoItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Integer imageView) {
            binding.photoView.setImageResource(imageView);
        }
    }
}

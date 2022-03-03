package com.example.m3l7hw.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3l7hw.Like;
import com.example.m3l7hw.R;
import com.example.m3l7hw.databinding.LikeItemBinding;

import java.util.ArrayList;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.LikeViewHolder> {

    private ArrayList<Like> likes;

    public LikeAdapter(ArrayList<Like> likes) {
        this.likes = likes;
    }

    @NonNull
    @Override
    public LikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LikeViewHolder(LikeItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LikeViewHolder holder, int position) {
        holder.bind(likes.get(position));
    }

    @Override
    public int getItemCount() {
        return likes.size();
    }

    class LikeViewHolder extends RecyclerView.ViewHolder {
        private LikeItemBinding binding;
        public LikeViewHolder(@NonNull LikeItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(Like like) {
            binding.likeImage.setImageResource(R.drawable.post_photo);
            binding.likeTv1.setText(like.getLikeText());
            binding.likeTv2.setText(like.getLikeData());
            binding.likeImage2.setImageResource(R.drawable.post_photo);

        }
    }

}

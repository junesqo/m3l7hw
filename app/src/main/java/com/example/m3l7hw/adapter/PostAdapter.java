package com.example.m3l7hw.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3l7hw.Post;
import com.example.m3l7hw.R;
import com.example.m3l7hw.databinding.PostItemBinding;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private ArrayList<Post> posts;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(PostItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.bind(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder {
        private PostItemBinding binding;

        public PostViewHolder(@NonNull PostItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Post post) {
            binding.postImage.setImageResource(R.drawable.post_photo);
            binding.postTextTv.setText(post.getPost_text());
            binding.postDataTv.setText(post.getPost_data());
        }
    }

}

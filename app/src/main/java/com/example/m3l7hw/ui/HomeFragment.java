package com.example.m3l7hw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l7hw.Post;
import com.example.m3l7hw.adapter.PostAdapter;
import com.example.m3l7hw.R;
import com.example.m3l7hw.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ArrayList<Post> posts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        PostAdapter postAdapter = new PostAdapter(posts);
        binding.homeRecycler.setAdapter(postAdapter);

    }

    private void loadData() {
        posts = new ArrayList<>();
        posts.add(new Post(R.drawable.post_photo, "joshua_l The game in Japan was amazing and I want to share some photos\"", "17 September"));
        posts.add(new Post(R.drawable.post_photo, "joshua_l The game in Japan was amazing and I want to share some photos\"", "17 September"));
        posts.add(new Post(R.drawable.post_photo, "joshua_l The game in Japan was amazing and I want to share some photos\"", "17 September"));
    }
}
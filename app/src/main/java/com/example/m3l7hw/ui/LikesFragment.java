package com.example.m3l7hw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l7hw.Like;
import com.example.m3l7hw.adapter.LikeAdapter;
import com.example.m3l7hw.R;
import com.example.m3l7hw.databinding.FragmentLikesBinding;

import java.util.ArrayList;


public class LikesFragment extends Fragment {

    private FragmentLikesBinding binding;
    private ArrayList<Like> likes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLikesBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        LikeAdapter likeAdapter = new LikeAdapter(likes);
        binding.likesRecycler.setAdapter(likeAdapter);
    }

    private void loadData() {
        likes = new ArrayList<>();
        likes.add(new Like(R.drawable.post_photo, "karennne liked your photo. ", "1h", R.drawable.post_photo));
        likes.add(new Like(R.drawable.post_photo, "karennne liked your photo. ", "1h", R.drawable.post_photo));
        likes.add(new Like(R.drawable.post_photo, "karennne liked your photo. ", "1h", R.drawable.post_photo));
        likes.add(new Like(R.drawable.post_photo, "karennne liked your photo. ", "1h", R.drawable.post_photo));
    }
}
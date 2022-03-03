package com.example.m3l7hw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l7hw.R;
import com.example.m3l7hw.adapter.PhotoAdapter;
import com.example.m3l7hw.databinding.FragmentMyPhotosBinding;
import com.example.m3l7hw.databinding.FragmentTaggedPhotosBinding;

import java.util.ArrayList;


public class TaggedPhotosFragment extends Fragment {

    private FragmentTaggedPhotosBinding binding;
    private ArrayList<Integer> photos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTaggedPhotosBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        PhotoAdapter photoAdapter = new PhotoAdapter(photos);
        binding.photosRecycler.setAdapter(photoAdapter);
        binding.photosRecycler.setLayoutManager(new GridLayoutManager(requireContext(), 3));
    }

    private void loadData() {
        photos = new ArrayList<Integer>();
        photos.add(R.drawable.p9);
        photos.add(R.drawable.p1);
        photos.add(R.drawable.p3);
        photos.add(R.drawable.p2);
        photos.add(R.drawable.p5);
        photos.add(R.drawable.p4);
        photos.add(R.drawable.p6);
        photos.add(R.drawable.p8);
        photos.add(R.drawable.p7);
    }
}
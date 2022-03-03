package com.example.m3l7hw.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3l7hw.R;
import com.example.m3l7hw.adapter.ViewPagerAdapter;
import com.example.m3l7hw.databinding.FragmentHomeBinding;
import com.example.m3l7hw.databinding.FragmentProfileBinding;
import com.example.m3l7hw.ui.model.Tabs;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    private ViewPagerAdapter viewPagerAdapter;
    private ArrayList<Tabs> fragments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragments = new ArrayList<>();
        fragments.add(new Tabs(new MyPhotosFragment(), R.drawable.ic_grid));
        fragments.add(new Tabs(new TaggedPhotosFragment(), R.drawable.ic_account));
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPagerAdapter.setFragments(fragments);
        binding.viewPager.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(fragments.get(position).getFragmentIcon());

            }
        }).attach();
    }
}
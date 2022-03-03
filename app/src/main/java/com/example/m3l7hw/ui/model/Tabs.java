package com.example.m3l7hw.ui.model;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Tabs {
    private Fragment fragment;
    private Integer fragmentIcon;

    public Tabs(Fragment fragment, Integer fragmentIcon) {
        this.fragment = fragment;
        this.fragmentIcon = fragmentIcon;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public Integer getFragmentIcon() {
        return fragmentIcon;
    }

    public void setFragmentIcon(Integer fragmentIcon) {
        this.fragmentIcon = fragmentIcon;
    }
}

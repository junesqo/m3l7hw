package com.example.m3l7hw;

import android.widget.ImageView;

public class Post {
    private int imageView;
    private String post_text;
    private String post_data;

    public Post(int imageView, String post_text, String post_data) {
        this.imageView = imageView;
        this.post_text = post_text;
        this.post_data = post_data;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public String getPost_data() {
        return post_data;
    }

    public void setPost_data(String post_data) {
        this.post_data = post_data;
    }
}



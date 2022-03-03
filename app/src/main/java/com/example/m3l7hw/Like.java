package com.example.m3l7hw;

public class Like {
    private int guestPhoto;
    private String likeText;
    private String likeData;
    private int likedPhoto;

    public Like(int guestPhoto, String likeText, String likeData, int likedPhoto) {
        this.guestPhoto = guestPhoto;
        this.likeText = likeText;
        this.likeData = likeData;
        this.likedPhoto = likedPhoto;
    }

    public int getGuestPhoto() {
        return guestPhoto;
    }

    public void setGuestPhoto(int guestPhoto) {
        this.guestPhoto = guestPhoto;
    }

    public String getLikeText() {
        return likeText;
    }

    public void setLikeText(String likeText) {
        this.likeText = likeText;
    }

    public String getLikeData() {
        return likeData;
    }

    public void setLikeData(String likeData) {
        this.likeData = likeData;
    }

    public int getLikedPhoto() {
        return likedPhoto;
    }

    public void setLikedPhoto(int likedPhoto) {
        this.likedPhoto = likedPhoto;
    }
}

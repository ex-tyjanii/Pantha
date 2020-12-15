package com.hassantijani.pantha.models;

public class Slider {
    private int sliderImg;
    private String title;

    public Slider(int sliderImg, String title) {
        this.sliderImg = sliderImg;
        this.title = title;
    }

    public int getSliderImg() {
        return sliderImg;
    }

    public String getTitle() {
        return title;
    }
}

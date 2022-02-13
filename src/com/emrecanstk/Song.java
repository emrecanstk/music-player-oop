package com.emrecanstk;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song() {

    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}

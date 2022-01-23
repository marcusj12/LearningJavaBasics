package com.careerdevs.songinfo;

public class Song {
    // 1. Create the fields

    public String title;
    public String artist;
    public String genre;
    public String features;
    public int seconds;

    // 2. Create the constructor

    public Song(String title, String artist, String genre, String features, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.features = features;
        this.seconds = seconds;

    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", features='" + features + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}

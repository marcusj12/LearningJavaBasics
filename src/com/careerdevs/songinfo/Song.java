package com.careerdevs.songinfo;

public class Song {
    // 1. Create the fields

    public String title;
    public String artist;
    public String genre;
    public String features;
    public int second;

    // 2. Create the constructor

    public Song(String songName, String artistName,String typeOfGenre, String features, int second) {
        this.title = songName;
        this.artist = artistName;
        this.genre = typeOfGenre;
        this.features = features;
        this.second = second;

    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", features='" + features + '\'' +
                ", second=" + second +
                '}';
    }
}

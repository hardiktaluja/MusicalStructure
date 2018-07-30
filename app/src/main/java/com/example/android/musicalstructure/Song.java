package com.example.android.musicalstructure;

public class Song {

    private String songName;

    private String artistName;

    private int albumArt;

    public Song(String songName, String artistName, int albumArt) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumArt = albumArt;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getAlbumArt() {
        return albumArt;
    }
}

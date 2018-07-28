package com.example.android.musicalstructure;

public class Song {

    private String mSongName;

    private String mArtistName;

    private int mAlbumArt;

    public Song(String songName, String artistName, int albumArt) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }
}

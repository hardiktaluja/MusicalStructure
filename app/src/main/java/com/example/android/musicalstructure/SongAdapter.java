package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View songView = convertView;
        if (songView == null) {
            songView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTextView = (TextView) songView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) songView.findViewById(R.id.artist_name);
        artistTextView.setText(currentSong.getArtistName());

        ImageView albumArt = (ImageView) songView.findViewById(R.id.album_art);
        albumArt.setImageResource(currentSong.getAlbumArt());

        return songView;
    }
}

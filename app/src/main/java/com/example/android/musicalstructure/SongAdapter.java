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

    static class ViewHolder {
        private TextView songTextView;
        private TextView artistTextView;
        private ImageView albumArt;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.songTextView = convertView.findViewById(R.id.song_name);
            holder.artistTextView = convertView.findViewById(R.id.artist_name);
            holder.albumArt = convertView.findViewById(R.id.album_art);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Song currentSong = getItem(position);

        holder.songTextView.setText(currentSong.getSongName());
        holder.artistTextView.setText(currentSong.getArtistName());
        holder.albumArt.setImageResource(currentSong.getAlbumArt());

        return convertView;
    }
}

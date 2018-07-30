package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.sunday), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.breathe), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.bully), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.sweet), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.bring), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.natalie), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.butterflies), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.moon), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.numb), getString(R.string.sia), R.drawable.colour));
        songs.add(new Song(getString(R.string.belong), getString(R.string.sia), R.drawable.colour));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

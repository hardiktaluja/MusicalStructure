package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class BouquetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.roses), getString(R.string.chainsmokers), R.drawable.bouquet));
        songs.add(new Song(getString(R.string.nyc), getString(R.string.chainsmokers), R.drawable.bouquet));
        songs.add(new Song(getString(R.string.gone), getString(R.string.chainsmokers), R.drawable.bouquet));
        songs.add(new Song(getString(R.string.waterbed), getString(R.string.chainsmokers), R.drawable.bouquet));
        songs.add(new Song(getString(R.string.intentions), getString(R.string.chainsmokers), R.drawable.bouquet));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

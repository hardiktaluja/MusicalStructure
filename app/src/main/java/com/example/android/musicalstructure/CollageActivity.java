package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CollageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.fires), getString(R.string.chainsmokers), R.drawable.collage));
        songs.add(new Song(getString(R.string.know), getString(R.string.chainsmokers), R.drawable.collage));
        songs.add(new Song(getString(R.string.closer), getString(R.string.chainsmokers), R.drawable.collage));
        songs.add(new Song(getString(R.string.inside), getString(R.string.chainsmokers), R.drawable.collage));
        songs.add(new Song(getString(R.string.down), getString(R.string.chainsmokers), R.drawable.collage));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

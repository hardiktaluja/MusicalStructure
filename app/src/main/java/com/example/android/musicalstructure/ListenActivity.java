package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.dangerous), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.love), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.lovers), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.loving), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.whisperer), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.bad), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.rise), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.shot), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.bang), getString(R.string.david), R.drawable.listen));
        songs.add(new Song(getString(R.string.wolf), getString(R.string.david), R.drawable.listen));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

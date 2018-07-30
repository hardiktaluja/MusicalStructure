package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout bouquet = findViewById(R.id.bouquet);
        bouquet.setOnClickListener(this);

        LinearLayout collage = findViewById(R.id.collage);
        collage.setOnClickListener(this);

        LinearLayout colour = findViewById(R.id.colour);
        colour.setOnClickListener(this);

        LinearLayout listen = findViewById(R.id.listen);
        listen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bouquet:
                Intent bouquetIntent = new Intent(MainActivity.this, BouquetActivity.class);
                startActivity(bouquetIntent);
                break;

            case R.id.collage:
                Intent collageIntent = new Intent(MainActivity.this, CollageActivity.class);
                startActivity(collageIntent);
                break;

            case R.id.colour:
                Intent colourIntent = new Intent(MainActivity.this, ColourActivity.class);
                startActivity(colourIntent);
                break;

            case R.id.listen:
                Intent listenIntent = new Intent(MainActivity.this, ListenActivity.class);
                startActivity(listenIntent);
                break;
        }

    }
}

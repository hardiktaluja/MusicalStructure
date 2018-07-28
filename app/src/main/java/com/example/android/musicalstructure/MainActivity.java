package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout bouquet = (LinearLayout) findViewById(R.id.bouquet);
        bouquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BouquetActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout collage = (LinearLayout) findViewById(R.id.collage);
        collage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CollageActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout colour = (LinearLayout) findViewById(R.id.colour);
        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColourActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout listen = (LinearLayout) findViewById(R.id.listen);
        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListenActivity.class);
                startActivity(intent);
            }
        });
    }
}

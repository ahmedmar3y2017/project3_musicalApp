package com.example.ahmed.project3_musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class romanceActivity extends AppCompatActivity {

    Button home;
    Button local;
    Button music;
    Button rab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);
        home = (Button) findViewById(R.id.homeromance);
        local = (Button) findViewById(R.id.localromance);
        music = (Button) findViewById(R.id.musicromance);
        rab = (Button) findViewById(R.id.rabromance);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(romanceActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(romanceActivity.this, localActivity.class);
                startActivity(i);

            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(romanceActivity.this, musicActivity.class);
                startActivity(i);

            }
        });
        rab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(romanceActivity.this, rabActivity.class);
                startActivity(i);

            }
        });

    }
}

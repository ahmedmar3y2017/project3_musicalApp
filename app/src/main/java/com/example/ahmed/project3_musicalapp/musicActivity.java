package com.example.ahmed.project3_musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class musicActivity extends AppCompatActivity {


    Button home;
    Button local;
    Button rab;
    Button romance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        home= (Button) findViewById(R.id.homemusic);
        local= (Button) findViewById(R.id.localmusic);
        rab= (Button) findViewById(R.id.rabmusic);
        romance= (Button) findViewById(R.id.romancemusic);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(musicActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(musicActivity.this,localActivity.class);
                startActivity(i);
            }
        });
        rab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(musicActivity.this,rabActivity.class);
                startActivity(i);
            }
        });
        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(musicActivity.this,romanceActivity.class);
                startActivity(i);

            }
        });

    }
}

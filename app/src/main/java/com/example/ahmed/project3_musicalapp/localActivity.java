package com.example.ahmed.project3_musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class localActivity extends AppCompatActivity {
    Button music;
    Button romance;
    Button rab;
    Button home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        music= (Button) findViewById(R.id.musiclocal);
        romance= (Button) findViewById(R.id.romancelocal);
        rab= (Button) findViewById(R.id.rablocal);
        home= (Button) findViewById(R.id.homelocal);

music.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(localActivity.this,musicActivity.class);
        startActivity(i);
    }
});

        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(localActivity.this,romanceActivity.class);
                startActivity(i);
            }
        });
        rab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(localActivity.this,rabActivity.class);
                startActivity(i);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(localActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}

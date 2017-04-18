package com.example.ahmed.project3_musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView local;
    TextView romance;
    TextView music;
    TextView rab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        local= (TextView) findViewById(R.id.local);
        romance= (TextView) findViewById(R.id.romance);
        music= (TextView) findViewById(R.id.music);
        rab= (TextView) findViewById(R.id.rab);

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,localActivity.class);
startActivity(i);
            }
        });

        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,romanceActivity.class);
                startActivity(i);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,musicActivity.class);
                startActivity(i);
            }
        });
        rab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,rabActivity.class);
                startActivity(i);
            }
        });


    }
}

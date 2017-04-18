
package com.example.ahmed.project3_musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rabActivity extends AppCompatActivity {

    Button home;
    Button local;
    Button music;
    Button romance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rab);
        home= (Button) findViewById(R.id.homerab);
        local= (Button) findViewById(R.id.localrab);
        music= (Button) findViewById(R.id.musicerab);
        romance= (Button) findViewById(R.id.romanceerab);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(rabActivity.this,MainActivity.class);
                startActivity(i);


            }
        });
        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(rabActivity.this,localActivity.class);
                startActivity(i);

            }
        });


        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(rabActivity.this,musicActivity.class);
                startActivity(i);
            }
        });
        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(rabActivity.this,romanceActivity.class);
                startActivity(i);
            }
        });




    }
}

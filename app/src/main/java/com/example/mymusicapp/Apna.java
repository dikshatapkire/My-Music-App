package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Apna extends AppCompatActivity {
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apna);
        start=findViewById(R.id.start1);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(Apna.this, ApnaService.class));
                Toast.makeText(Apna.this, "Song is play", Toast.LENGTH_SHORT).show();


            }
        });
        stop=findViewById(R.id.stop1);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(Apna.this,ApnaService.class));
                Toast.makeText(Apna.this, "Song stopped", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
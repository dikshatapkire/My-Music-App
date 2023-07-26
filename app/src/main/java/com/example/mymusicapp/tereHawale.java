package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tereHawale extends AppCompatActivity {
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tere_hawale);

        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(tereHawale.this, tereHawaleService.class));
                Toast.makeText(tereHawale.this, "Song is play", Toast.LENGTH_SHORT).show();


            }
        });
        stop=findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(tereHawale.this, tereHawale.class));
                Toast.makeText(tereHawale.this, "Song stopped", Toast.LENGTH_SHORT).show();


            }
        });
    }
    }

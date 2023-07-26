package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class samjhawa extends AppCompatActivity {
    Button start , stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samjhawa);
        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(samjhawa.this, samjhawanService.class));
                Toast.makeText(samjhawa.this, "Song is play", Toast.LENGTH_SHORT).show();


            }
        });
        stop=findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(samjhawa.this,samjhawanService.class));
                Toast.makeText(samjhawa.this, "Song stopped", Toast.LENGTH_SHORT).show();


            }
        });
    }
    }

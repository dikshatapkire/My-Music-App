package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {
    Button tereHawale,samjhawa,ApanaBanale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ApanaBanale=findViewById(R.id.button);
        samjhawa=findViewById(R.id.button2);
        tereHawale=findViewById(R.id.button4);
        ApanaBanale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this, Apna.class));

            }
        });

     samjhawa.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(secondActivity.this, samjhawa.class));

         }
     });
     tereHawale.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(secondActivity.this,tereHawale.class));

         }
     });

    }
}
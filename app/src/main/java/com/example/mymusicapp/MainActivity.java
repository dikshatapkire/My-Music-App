package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnext;
    EditText email,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnext=findViewById(R.id.btn1);
        email=findViewById(R.id.et1);
        pass=findViewById(R.id.et2);


        //
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email =email.getText().toString().trim();
                String Password=pass.getText().toString().trim();
                startActivity(new Intent(MainActivity.this,secondActivity.class));
            }


        });



    }
}
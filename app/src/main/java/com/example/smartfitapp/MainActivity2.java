package com.example.smartfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Button btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);

            }

        });

    }

}
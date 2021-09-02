package com.example.smartfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.login_button1);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText editText = findViewById(R.id.editTextTextPersonName);
                Intent intent = new Intent(getBaseContext(), MainActivity.class);

                intent.putExtra("nome", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
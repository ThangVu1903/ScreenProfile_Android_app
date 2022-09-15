package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLogin,btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin2);
        btnSingUp = findViewById(R.id.btnSignUp);
        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnActivity_signUp();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnActivity();
            }
        });
    }
    public void btnActivity(){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void btnActivity_signUp(){
        Intent intent = new Intent(MainActivity.this,sign_up_activity.class);
        startActivity(intent);
    }
}
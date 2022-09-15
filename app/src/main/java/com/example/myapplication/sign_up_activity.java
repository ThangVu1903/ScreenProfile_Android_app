package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_up_activity extends AppCompatActivity {
    Button btnRegister ;
    TextView txtBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnRegister = findViewById(R.id.btnRegister);
        txtBack = findViewById(R.id.backRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity();
            }
        });

        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Activity();
            }
        });
    }
    public void Activity(){
        Intent intent_1 = new Intent(sign_up_activity.this,MainActivity.class);
        startActivity(intent_1);
    }
}
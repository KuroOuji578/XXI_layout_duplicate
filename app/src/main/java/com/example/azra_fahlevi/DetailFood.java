package com.example.azra_fahlevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFood extends AppCompatActivity {

    public ImageView btnBack;
    public TextView btnCombo,btnPopcorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        btnBack = findViewById(R.id.btn_back);
        btnCombo = findViewById(R.id.combo);
        btnPopcorn= findViewById(R.id.popcorn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(itn);
                finish();
            }
        });
        btnCombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), DetailFood2.class);
                startActivity(itn);
                finish();
            }
        });

        btnPopcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), DetailFood3.class);
                startActivity(itn);
                finish();
            }
        });
    }
}
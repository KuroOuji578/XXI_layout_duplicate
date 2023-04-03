package com.example.azra_fahlevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFood2 extends AppCompatActivity {

    public ImageView btnBack;
    public TextView btnPromo,btnPopcorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food2);

        btnBack = findViewById(R.id.btn_back);
        btnPromo= findViewById(R.id.promo);
        btnPopcorn= findViewById(R.id.popcorn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(itn);
                finish();
            }
        });
        btnPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), DetailFood.class);
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
package com.example.azra_fahlevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    public ImageView btnMenu;
    public androidx.constraintlayout.widget.ConstraintLayout btnDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnMenu = findViewById(R.id.btn_menu);
        btnDetail = findViewById(R.id.detail_food);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itn);
                finish();
            }
        });

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), DetailFood.class);
                startActivity(itn);
                finish();
            }
        });

        //sebuah pembaharuan
    }
}
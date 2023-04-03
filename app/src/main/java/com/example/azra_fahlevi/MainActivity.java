package com.example.azra_fahlevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView btnFoood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoood = findViewById(R.id.btn_food);

        btnFoood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(itn);
                finish();
            }
        });
    }
}
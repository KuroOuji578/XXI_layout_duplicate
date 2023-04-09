package com.example.azra_fahlevi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    public ImageView btnFoood;

    RecyclerView recyclerView;
    List<com.example.azra_fahlevi.Movie> movies;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvListMovie);
        movies = new ArrayList<>();
        getApi();

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

    private void getApi() {
        String url = "";
        OkHttpClient client =new OkHttpClient();
        Request request = new Request.Builder().url().build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(()-> Toast.makeText(MainActivity.this, "Fail to conect", Toast.LENGTH_SHORT).show());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                final String responseData = response.body().string();
                try {
                    JSONObject objData = new JSONObject(responseData);
                    final JSONArray results = objData.getJSONArray("results");
                    for (int i = 0; i < results.length(); i++){
                        Movie movie = new movie(
                                new JSONObject(results.get(i).toString()).getString("title"),
                        );
                        movies.add(movie);
                    }

                    runOnUiThread(()->{
                        adapter = new MovieAdapter(movies);
                        recyclerView.setAdapter(adapter);
                        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2,RecyclerView.VERTICAL,
                    });
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }
        });
    }
}
package com.example.c4q.midunitfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RetrofitFactory retrofitFactory;
    RetrofitFactory.UserNetworkListener userNetworkListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();

        recyclerView = findViewById(R.id.main_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 3));
        recyclerView.setAdapter(adapter);

    }

    public void getUser(){
        userNetworkListener = new RetrofitFactory.UserNetworkListener() {

            @Override
            public void userCallback(ResponseUser responseUser) {

            }
        };
    }
}


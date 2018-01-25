package com.example.c4q.midunitfive;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by C4Q on 1/24/2018.
 */

public class RetrofitFactory {

    public static RetrofitFactory retrofitFactory;
    private Retrofit retrofit;
    UserNetworkListener userNetworkListener;

    public RetrofitFactory getInstance(){
        if(retrofitFactory == null){
            retrofitFactory = new RetrofitFactory();
        }
        return retrofitFactory;
    }

    public void setUserNetworkListener(UserNetworkListener userNetworkListener){
        this.userNetworkListener = userNetworkListener;
    }

    private Retrofit buildRetrofit(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://randomuser.me/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public void getUser(){
        UserServices services = buildRetrofit().create(UserServices.class);
        Call<ResponseUser> users = services.getUsers();
        users.enqueue(new Callback<ResponseUser>() {

            @Override
            public void onResponse(Call<ResponseUser> call, Response<ResponseUser> response) {
                if(userNetworkListener!=null) {
                    userNetworkListener.userCallback(response.body());
                }
            }

            @Override
            public void onFailure(Call<ResponseUser> call, Throwable t) {
                Log.d("TAG", "onResponse: " + t.toString());
            }
        });
    }


    public interface UserNetworkListener {
        void userCallback(ResponseUser responseUser);
    }
}

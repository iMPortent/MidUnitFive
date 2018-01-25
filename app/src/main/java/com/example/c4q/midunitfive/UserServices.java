package com.example.c4q.midunitfive;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by C4Q on 1/24/2018.
 */

public interface UserServices {
    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<ResponseUser>getUsers();
}

package com.example.garbagem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//import retrofit2.http.POST;

public interface ApiInterface {



    @GET("http://localhost:8000/api/announcements")
    Call<List<Retromodel>> getRetromodel();


}

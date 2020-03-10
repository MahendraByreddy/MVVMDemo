package com.example.mvvmdemo.API;

import com.example.mvvmdemo.Model.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
        String BASE_URL = "https://simplifiedcoding.net/demos/";

        @GET("marvel")
        Call<List<Hero>> getHeroes();
    }


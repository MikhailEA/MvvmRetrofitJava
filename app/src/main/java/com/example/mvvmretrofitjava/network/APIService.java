package com.example.mvvmretrofitjava.network;



import com.example.mvvmretrofitjava.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("volley_array.json")
    Call<List<MovieModel>> getMovieList();


}

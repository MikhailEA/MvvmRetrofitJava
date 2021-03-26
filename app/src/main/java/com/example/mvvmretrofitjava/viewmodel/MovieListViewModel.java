package com.example.mvvmretrofitjava.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.mvvmretrofitjava.model.MovieModel;
import com.example.mvvmretrofitjava.network.APIService;
import com.example.mvvmretrofitjava.network.RetroInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MovieListViewModel extends ViewModel {

    public MovieListViewModel() {
    }

    public void makeApiCall() {
        APIService apiService = RetroInstance.getRetroClient().create(APIService.class);
        Call<List<MovieModel>> call = apiService.getMovieList();
        call.enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(Call<List<MovieModel>> call, Response<List<MovieModel>> response) {
                
            }

            @Override
            public void onFailure(Call<List<MovieModel>> call, Throwable t) {

            }
        });
    }
}

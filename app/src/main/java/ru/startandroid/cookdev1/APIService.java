package ru.startandroid.cookdev1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("cookdev/get_recipes.php")
    Call<List<Recipe>> getCooks(@Query("category") int category);
}

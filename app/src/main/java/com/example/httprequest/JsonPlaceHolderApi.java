package com.example.httprequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("photos")
    Call<List<Post>> getPhoto();
}

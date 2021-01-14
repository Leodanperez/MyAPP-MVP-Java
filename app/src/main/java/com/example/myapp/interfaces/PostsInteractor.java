package com.example.myapp.interfaces;

import com.example.myapp.interactors.PostsInteractorImpl;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsInteractor {

    @GET("posts")
    Call<List<PostsInteractorImpl>> getPosts();
}

package com.example.prep1.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory




object ApiClient {

    var baseUrl = "http://api.themoviedb.org/3/"
    var retrofit:Retrofit?=null

    init {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }





}
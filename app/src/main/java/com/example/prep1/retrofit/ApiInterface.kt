package com.example.prep1.retrofit


import com.example.prep1.retrofit.models.StoreResponseTab
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @GET("movie/top_rated")
    fun getTopRatedMovies(@Query("api_key") apiKey:String): Call<MoviesResponse>

    @GET("movie/{id}")
    fun getMovieDetails(@Path("id") id: Int, @Query("api_key") apiKey: String?): Call<MoviesResponse>

    @FormUrlEncoded
    @POST("item/get_items_by_store")
    fun getStoreItemsData(@Field("storeId") storeId: String?): Call<StoreResponseTab>


    @POST("item/get_items_by_store.php")
    fun getStoreWithBody(@Body storeResponseTab: StoreResponseTab): Call<StoreResponseTab>
}
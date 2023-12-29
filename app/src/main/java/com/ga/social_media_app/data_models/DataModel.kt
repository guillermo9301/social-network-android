package com.ga.social_media_app.data_models

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface DataService {
    @GET("newsfeed")
    suspend fun getData():List<dataResponse>
}

object DataApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://guillermo93.pythonanywhere.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val dataService: DataService = retrofit.create(DataService::class.java)
}
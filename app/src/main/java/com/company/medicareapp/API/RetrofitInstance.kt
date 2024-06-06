package com.company.medicareapp.API

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val client:OkHttpClient = OkHttpClient.Builder().build()

    val api:API_Builder = Retrofit.Builder()
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(API_Builder.BASE_URL).build()
        .create(API_Builder::class.java)
}
package com.company.medicareapp.API

import retrofit2.http.GET

interface API_Builder {

    @GET("/getAllusers")
    suspend fun UserInfo() : UserInfo

    companion object{
        val BASE_URL = "https://abid1660.pythonanywhere.com"
    }
}
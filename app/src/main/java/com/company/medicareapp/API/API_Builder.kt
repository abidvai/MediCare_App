package com.company.medicareapp.API

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface API_Builder {

    @GET("/getAllusers")
    suspend fun UserInfo() : UserInfo

    @FormUrlEncoded
    @POST("/createUser")
    suspend fun createUser(
        @Field("name") name : String,
        @Field("password") password : String,
        @Field("address") address : String,
        @Field("email") email: String,
        @Field("phone") phone : String,
        @Field("pincode") pinCode : String
        
    ) : Response<UserCreateResponse>

    companion object{
       const val BASE_URL = "https://abid1660.pythonanywhere.com"
    }
}
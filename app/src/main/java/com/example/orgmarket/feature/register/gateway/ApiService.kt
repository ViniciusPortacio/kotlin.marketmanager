package com.example.orgmarket.feature.register.gateway

import com.example.orgmarket.feature.register.model.newUser
import com.example.orgmarket.feature.register.model.newUserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Content-Type: application/json; charset=utf-8")
    @POST("api/cadastrar")
    fun registerUser(@Body body: newUser ): Call<newUserResponse>


}
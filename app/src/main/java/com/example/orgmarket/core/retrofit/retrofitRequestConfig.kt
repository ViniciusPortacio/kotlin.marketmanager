package com.example.orgmarket.core.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofitRequestConfig{
    object retrofitRequestConfig{
        var retrofit: Retrofit? = null


        fun getClient(BASE_URL: String): Retrofit? {

            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }
}
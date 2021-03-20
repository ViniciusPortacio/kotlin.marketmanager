package com.example.orgmarket.core.retrofit

import com.example.orgmarket.core.retrofit.retrofitRequestConfig.retrofitRequestConfig.getClient

interface ApiUtils {

    object ApiUtils {
        val BASE_URL = "http://192.168.1.182:3004/api/v1/"
        val apiService: ApiUtils
            get() = retrofitRequestConfig.retrofitRequestConfig.getClient(BASE_URL)!!.create(ApiUtils::class.java)

    }
}
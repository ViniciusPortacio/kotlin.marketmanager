package com.example.orgmarket.feature.register.business

import com.example.orgmarket.feature.register.plugin.ApiService
import com.example.orgmarket.framework.retrofit.retrofitBuilder

interface retrofitBuilderInjector {
    object ApiUtils {
        val BASE_URL = "http://192.168.1.182:3004/"
        val apiService: ApiService
            get() = retrofitBuilder.retrofitRequestConfig.getClient(BASE_URL)!!.create(ApiService::class.java)

    }
}
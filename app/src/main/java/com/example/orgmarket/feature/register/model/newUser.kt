package com.example.orgmarket.feature.register.model

import com.google.gson.annotations.SerializedName

data class newUser(
    @SerializedName("userId")
    val userId: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("email")
    val email: String
)

data class newUserResponse(
    @SerializedName("responseStatus")
    val responseStatus: Int,
    @SerializedName("responseMessage")
    val responseMessage: String
)
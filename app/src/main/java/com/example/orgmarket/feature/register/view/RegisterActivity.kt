package com.example.orgmarket.feature.register.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.orgmarket.R
import com.example.orgmarket.core.retrofit.retrofitRequestConfig
import com.example.orgmarket.feature.register.gateway.ApiService
import com.example.orgmarket.feature.register.model.newUser
import com.example.orgmarket.feature.register.model.newUserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    companion object{
        lateinit var self: RegisterActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val submitRegister = findViewById<Button>(R.id.register_button)
        val username = findViewById<EditText>(R.id.username).text.toString()
        val password = findViewById<EditText>(R.id.password).text.toString()
        val confirmPassword = findViewById<EditText>(R.id.confirm_password).text.toString()
        val email = findViewById<EditText>(R.id.email).text.toString()

    }
}
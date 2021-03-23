package com.example.orgmarket.feature.register.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.orgmarket.R
import com.example.orgmarket.feature.register.model.newUser
import com.example.orgmarket.feature.register.model.newUserResponse
import com.example.orgmarket.feature.register.plugin.ApiService
import com.example.orgmarket.feature.register.business.retrofitBuilderInjector
import com.example.orgmarket.framework.authentication.idGenerator
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


        val username = findViewById<EditText>(R.id.username).text
        val password = findViewById<EditText>(R.id.password).text
        val confirmPassword = findViewById<EditText>(R.id.confirm_password).text
        val email = findViewById<EditText>(R.id.email).text

        submitRegister.setOnClickListener {
            val userId = idGenerator(username.toString())

            if(username.length > 5){
                if (email.length > 10) {
                    if(password.toString() == confirmPassword.toString()) {

                        var mAPIService: ApiService? = null
                        mAPIService = retrofitBuilderInjector.ApiUtils.apiService

                        mAPIService.registerUser(
                            newUser(userId.toString(), username.toString(), password.toString(), email.toString())
                        ).enqueue(object : Callback<newUserResponse> {
                            override fun onFailure(call: Call<newUserResponse>, t: Throwable) {
                                println(t.message)
                            }

                            override fun onResponse(call: Call<newUserResponse>, response: Response<newUserResponse>) {
                            }
                        })
                    }
                    else println("Senhas não coincidem")
                }
                else println("email inválido")
            }
            else println("username inválido")
        }
    }
}
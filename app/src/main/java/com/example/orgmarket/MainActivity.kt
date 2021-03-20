package com.example.orgmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.orgmarket.feature.register.view.RegisterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRegister = findViewById<Button>(R.id.register_button)
        buttonRegister.setOnClickListener {
            val openNewActivity = Intent(this, RegisterActivity::class.java )
            startActivity(openNewActivity)
            }

//        val buttonLogin = findViewById<Button>(R.id.login_button)
//        buttonRegister.setOnClickListener {
//            val openNewActivity = Intent(this, LoginActivity::class.java )
//            startActivity(openNewActivity)
//        }
    }
}
package com.example.exercise3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    private lateinit var loginbtn : Button
    private lateinit var regbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        loginbtn = findViewById(R.id.loginbtn)
        regbtn = findViewById(R.id.registerbtn)

        loginbtn.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            // TODO: put password stuff from firebase or whatever
            startActivity(intent)
            finish()

        }

        regbtn.setOnClickListener{

            val intent = Intent(this, MuscleGrps::class.java)
            // TODO: put password stuff from firebase or whatever
            startActivity(intent)
            finish()

        }
    }
}
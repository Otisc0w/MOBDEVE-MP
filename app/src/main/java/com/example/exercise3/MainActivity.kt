package com.example.exercise3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.widget.SearchView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var loginbtn: Button
    private lateinit var registerbtn: Button
    private lateinit var unamebox: EditText
    private lateinit var passbox: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn = findViewById(R.id.loginbtn)
        registerbtn = findViewById(R.id.registerbtn)
        unamebox = findViewById(R.id.unamebox)
        passbox = findViewById(R.id.passbox)

        loginbtn.setOnClickListener {

            val uname = "welcome, " + unamebox.text.toString().trim() + "!"
            val pass = passbox.text.toString().trim()

            if (unamebox.text.isNullOrBlank()) {
                Toast.makeText(this, "please fill in fields", Toast.LENGTH_SHORT)
            } else {

                val intent = Intent(this, MuscleGrps::class.java).also {
                    it.putExtra("msg", uname)
                }
                startActivity(intent)
                finish()
            }

        }

        registerbtn.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)

            startActivity(intent)
            finish()

        }
    }
}
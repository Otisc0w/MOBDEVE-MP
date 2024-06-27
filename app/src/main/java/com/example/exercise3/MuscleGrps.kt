package com.example.exercise3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MuscleGrps : AppCompatActivity() {

    private lateinit var front : ImageView
    private lateinit var back : ImageView
    private lateinit var legs : ImageView
    private lateinit var core : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muscle_grps)


        front = findViewById(R.id.front)
        back = findViewById(R.id.back)
        legs = findViewById(R.id.legs)
        core = findViewById(R.id.core)
//                                                                             front=1 back=2 legs=3 core=4 (for intent putextra only)
        front.setOnClickListener {
                val intent = Intent(this, Workouts::class.java)
                intent.putExtra("grp", "1")
                startActivity(intent)
                finish()
        }

        back.setOnClickListener {
            val intent = Intent(this, Workouts::class.java)
            intent.putExtra("grp", "2")
            startActivity(intent)
            finish()
        }

        legs.setOnClickListener {
            val intent = Intent(this, Workouts::class.java)
            intent.putExtra("grp", "3")
            startActivity(intent)
            finish()
        }

        core.setOnClickListener {
            val intent = Intent(this, Workouts::class.java)
            intent.putExtra("grp", "4")
            startActivity(intent)
            finish()
        }


    }

}
package com.example.exercise3

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class RestTimer : AppCompatActivity() {

    private lateinit var timer: CountDownTimer
    private lateinit var textView: TextView
    private lateinit var skipbtn: Button
    private lateinit var wonum: TextView



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest_timer)

        var helper = DataBaseHandler(applicationContext)
        var db = helper.readableDatabase
        var count = DatabaseUtils.queryNumEntries(db, "PROGRAM")

        var x= count.toInt()
        skipbtn = findViewById(R.id.skip)
        textView = findViewById<AppCompatTextView>(R.id.textView)
        wonum = findViewById(R.id.wonum)
        val intent = Intent(this, ProgramActivity::class.java)


        timer = object : CountDownTimer(2_000, 1_000) {

            override fun onTick(remaining: Long) {
                textView.text = remaining.toString()
                wonum.text= x.toString()


            }

            override fun onFinish() {
                textView.text = "Workout!"
                skipbtn.text= "Rest"
                skipbtn.setOnClickListener {
                    x-=1
                    timer.start()
                    skipbtn.text = "resting..."
                    if (x == 0) {
                        startActivity(intent)
                        finish()

                    }
                }

            }
        }
    }

    override fun onStart() {
        super.onStart()
        skipbtn.setOnClickListener{
            timer.start()
            skipbtn.text="resting..."
        }
    }

    override fun onStop(){
        super.onStop()
        timer.cancel()
    }


}
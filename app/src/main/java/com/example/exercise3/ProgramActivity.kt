package com.example.exercise3

import ProgramAdapter
import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ProgramActivity : AppCompatActivity() {

    private lateinit var progRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Workout>
    private lateinit var tempArrayList : ArrayList<Workout>

    lateinit var workouts: ArrayList<String>
    lateinit var sets: ArrayList<String>
    lateinit var reps: ArrayList<String>
    private lateinit var delbtn: ImageView
    private lateinit var startbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)

        workouts = arrayListOf<String>()
        sets = arrayListOf<String>()
        reps = arrayListOf<String>()

        delbtn = findViewById(R.id.delete)
        startbtn = findViewById(R.id.start)

        var helper = DataBaseHandler(applicationContext)
        var db = helper.readableDatabase
        val rs = db.rawQuery("SELECT * FROM PROGRAM", null)

        var count = DatabaseUtils.queryNumEntries(db, "PROGRAM")
        var countint = count.toInt() - 1

//        Toast.makeText(applicationContext, count.toString(), Toast.LENGTH_LONG).show()

        if(count.toInt() >0) {
            if(rs.moveToFirst()) {
                for (i in 0..countint) {
                    workouts.add(rs.getString(0))
                    sets.add(rs.getString(1))
                    reps.add(rs.getString(2))
                    rs.moveToNext()
                }
            }
        }



        delbtn.setOnClickListener {

            db.delete("PROGRAM", null, null)

            db.close()

            val intent = Intent(this, ProgramActivity::class.java)
            startActivity(intent)
            finish()
        }

        startbtn.setOnClickListener{
            val intent = Intent(this, RestTimer::class.java)
            intent.putExtra("num",count.toInt())
            startActivity(intent)
            finish()
        }

        progRecylerview =findViewById(R.id.progrecyclerView)
        progRecylerview.layoutManager = LinearLayoutManager(this)
        progRecylerview.setHasFixedSize(true)

        newArrayList = arrayListOf<Workout>()
        tempArrayList = arrayListOf<Workout>()

        getProgdata()

    }

    private fun getProgdata() {

        for (i in workouts.indices) {

            val workout = Workout(workouts[i], sets[i], reps[i])
            newArrayList.add(workout)

        }

        tempArrayList.addAll(newArrayList)
        val adapter = ProgramAdapter(tempArrayList)

        progRecylerview.adapter = adapter

    }
}
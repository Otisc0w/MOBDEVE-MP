package com.example.exercise3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class Workouts : AppCompatActivity() {

    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Content>
    private lateinit var tempArrayList : ArrayList<Content>
    lateinit var titles: Array<String>
    lateinit var musclepart: Array<String>
    lateinit var images: Array<Int>
    lateinit var vid: Array<String>
    lateinit var desc: Array<String>
    lateinit var pics: Array<Int>

    private lateinit var backbtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workouts)

        backbtn = findViewById(R.id.prev)

        backbtn.setOnClickListener{
            val intent = Intent(this, MuscleGrps::class.java)
            startActivity(intent)
            finish()
        }

        titles = arrayOf("", "", "","", "", "","", "", "", "", "", "")

        musclepart = arrayOf("", "", "","", "", "","", "", "", "", "", "")

        images = arrayOf(
            R.drawable.benchpress, R.drawable.pecpress, R.drawable.pushups, R.drawable.chest, R.drawable.ohpstand, R.drawable.dbohp, R.drawable.pikepushup, R.drawable.shoulders,
            R.drawable.dbskull, R.drawable.triceppush, R.drawable.diapushup,R.drawable.triceps, R.drawable.latpull, R.drawable.pullup, R.drawable.negapullup, R.drawable.lats,
            R.drawable.bbrow, R.drawable.cbrow, R.drawable.invrow, R.drawable.traps, R.drawable.ezbar, R.drawable.dbcurl, R.drawable.chinup, R.drawable.biceps, R.drawable.legpress,
            R.drawable.legextension, R.drawable.squat, R.drawable.quad, R.drawable.smithmachinedeadlift, R.drawable.legcurl, R.drawable.goodmorning, R.drawable.hams, R.drawable.machinecalfraise,
            R.drawable.calfraise, R.drawable.calves, R.drawable.crunches, R.drawable.abmachine, R.drawable.legraise, R.drawable.abs, R.drawable.backextension, R.drawable.superman, R.drawable.kettlebell, R.drawable.lback)

        pics = arrayOf(R.drawable.benchpress, R.drawable.pecpress, R.drawable.pushups,R.drawable.benchpress, R.drawable.pecpress, R.drawable.pushups,R.drawable.benchpress, R.drawable.pecpress, R.drawable.pushups,R.drawable.benchpress, R.drawable.pecpress, R.drawable.pushups,)

        vid = arrayOf("", "", "","", "", "","", "", "", "", "", "")
        desc = arrayOf("", "", "","", "", "","", "", "", "", "", "")


        var helper = DataBaseHandler(applicationContext)
        var db = helper.readableDatabase
        val rs = db.rawQuery("SELECT * FROM WORKOUTS", null)

        if(rs.moveToFirst()) {

            val bundle : Bundle?= intent.extras
            val grp = bundle!!.getString("grp")


            if(grp == "1") {
                for (i in 0..11) {
                    titles[i] = rs.getString(0)
                    musclepart[i] = rs.getString(1)
                    vid[i] = rs.getString(2)
                    desc[i] = rs.getString(3)
                    pics[i]= images[i+11]
                    rs.moveToNext()
                }
            }
            else if(grp=="2"){
                for (i in 0 ..11) {
                    rs.moveToNext()
                }
                for (i in 0 ..11) {
                    titles[i] = rs.getString(0)
                    musclepart[i] = rs.getString(1)
                    vid[i] = rs.getString(2)
                    desc[i] = rs.getString(3)
                    pics[i]= images[i+14]
                    rs.moveToNext()
                }
            }

            else if(grp=="3"){
                for (i in 0 ..23) {
                    rs.moveToNext()
                }
                for (i in 0 ..10) {
                    titles[i] = rs.getString(0)
                    musclepart[i] = rs.getString(1)
                    vid[i] = rs.getString(2)
                    desc[i] = rs.getString(3)
                    pics[i]= images[i+25]
                    rs.moveToNext()
                }
            }
            else if(grp=="4"){
                for (i in 0 ..34) {
                    rs.moveToNext()
                }
                for (i in 0 ..7) {
                    titles[i] = rs.getString(0)
                    musclepart[i] = rs.getString(1)
                    vid[i] = rs.getString(2)
                    desc[i] = rs.getString(3)
                    pics[i]= images[i+35]
                    rs.moveToNext()
                }
            }


            db.close()

        }


        newRecylerview =findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)  //calling recylcerview i think
        newRecylerview.setHasFixedSize(true)


        newArrayList = arrayListOf<Content>()
        tempArrayList = arrayListOf<Content>()
        getUserdata()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_item,menu)
        val item = menu?.findItem(R.id.filter_action)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                tempArrayList.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if (searchText.isNotEmpty()){

                    newArrayList.forEach {

                        if (it.muscle.toLowerCase(Locale.getDefault()).contains(searchText)){


                            tempArrayList.add(it)

                        }

                    }

                    newRecylerview.adapter!!.notifyDataSetChanged()

                }else{

                    tempArrayList.clear()
                    tempArrayList.addAll(newArrayList)
                    newRecylerview.adapter!!.notifyDataSetChanged()

                }


                return false

            }


        })

        return super.onCreateOptionsMenu(menu)


    }

    //use this v to show recylcerview stuff
    private fun getUserdata() {

        val bundle : Bundle?= intent.extras
        val grp = bundle!!.getString("grp")

        for (i in titles.indices) {

            val content = Content(titles[i], pics[i], musclepart[i], vid[i], desc[i])
            newArrayList.add(content)

        }

        tempArrayList.addAll(newArrayList)
        val adapter = MyAdapter(tempArrayList)

        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                val intent = Intent(this@Workouts,ContentActivity::class.java)
                intent.putExtra("title",titles[position])
                intent.putExtra("images",images[position])
                intent.putExtra("vid", vid[position])
                intent.putExtra("dsc", desc[position])
                intent.putExtra("grp", grp)
                startActivity(intent)

            }


        })



    }
}
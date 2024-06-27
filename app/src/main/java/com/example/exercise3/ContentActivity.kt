package com.example.exercise3

import android.content.ContentValues
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class ContentActivity : AppCompatActivity() {

    private lateinit var addbtn: Button
    private lateinit var progbtn: Button
    private lateinit var reps: EditText
    private lateinit var sets: EditText
    private lateinit var backbtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        var helper = DataBaseHandler(applicationContext)
        var db = helper.readableDatabase
        val rs = db.rawQuery("SELECT * FROM PROGRAM", null)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        val ctitle : TextView = findViewById(R.id.cont_title)
        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)
        val cdesc : TextView = findViewById(R.id.cont_description)

        reps = findViewById(R.id.reps)
        sets = findViewById(R.id.sets)

        val bundle : Bundle?= intent.extras
        val title = bundle!!.getString("title")
        val id = bundle!!.getString("vid")!!
        val desc = bundle!!.getString("dsc")
        val grp = bundle!!.getString("grp")

        backbtn = findViewById(R.id.prev)

        backbtn.setOnClickListener{
            val intent = Intent(this, Workouts::class.java)
            intent.putExtra("grp", grp)
            startActivity(intent)
            finish()
        }

        ctitle.text = title
        cdesc.text = desc

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                // loading the selected video into the YouTube Player
                    youTubePlayer.loadVideo(id, 0F)
            }
        })

        addbtn = findViewById(R.id.addprog)
        progbtn = findViewById(R.id.goprog)

        addbtn.setOnClickListener{
            if(addbtn.text == "Add to program") {

                var cv = ContentValues()
                cv.put("WORKOUT", title.toString())
                cv.put("SETS", sets.text.toString())
                cv.put("REPS", reps.text.toString())
                db.insert("PROGRAM", null, cv)

                addbtn.text = "Added!"
            }
            else {
                addbtn.text = "Add to program"
            }
        }

        progbtn.setOnClickListener{
            val intent = Intent(this, ProgramActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}
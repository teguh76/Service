package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_facebook.setOnClickListener( {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/wiidodo.communiity/"))
        startActivity(i)
        })

        btn_instagram.setOnClickListener( {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tguhw_76/?hl=id/"))
            startActivity(i)
        }
        )
            var  mediaPlayer:MediaPlayer?= MediaPlayer.create(this,R.raw.release)
        btn_play.setOnClickListener {
            mediaPlayer?.start()
        }
        btn_pause.setOnClickListener {
            mediaPlayer?.pause()
        }
        btn_stop.setOnClickListener {
            mediaPlayer?.pause()
            mediaPlayer?.seekTo(0)
        }
    }

}


package com.example.video_player


import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val videoView = findViewById<VideoView>(R.id.testView)
        // Creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        // Specify the location of media file
        val uri:Uri = Uri.parse("android.resource://" + packageName + "/raw/test")

        //Setting MediaController and URI, then starting the videoView

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()




    }
}
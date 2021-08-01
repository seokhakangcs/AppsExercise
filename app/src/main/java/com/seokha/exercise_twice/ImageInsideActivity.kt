package com.seokha.exercise_twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        var index:Int = intent.getIntExtra("index", 0)
        var resourceID = resources.getIdentifier(
            "member_$index",
            "drawable",
            packageName
        )
        var imageView = findViewById<ImageView>(R.id.inside_activity)
        imageView.setImageResource(resourceID)
    }
}


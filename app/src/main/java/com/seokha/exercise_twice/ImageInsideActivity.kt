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
        Log.e("index", index.toString())

        var resID = resources.getIdentifier(
            "member_$index",
            "drawable",
            packageName
        )
        var image = findViewById<ImageView>(R.id.inside_activity)
        image.setImageResource(resID)
        Log.e("Check-2", resID.toString())
    }
}


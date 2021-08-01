package com.seokha.exercise_twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttons = arrayOfNulls<ImageView>(9)

        for(i in 0..8) {
            var resourceID = resources.getIdentifier(
                "member_" + (i+1),
                "id",
                packageName
            )
            buttons[i] = findViewById<ImageView>(resourceID)
            buttons[i]?.setOnClickListener{
                val intent = Intent(this, ImageInsideActivity::class.java)
                intent.putExtra("index", i+1)
                startActivity(intent)
            }
        }
    }
}
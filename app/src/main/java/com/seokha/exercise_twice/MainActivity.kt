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

//        for(i in 0..9)
//        {
//            var IDs : Int = resources.getIdentifier("member_"+(i+1), "drawable", "com.seokha.exercise_twice")
//        }
//        var btn1 = findViewById<ImageView>(R.id.member_1)
//        Log.e("Check1", R.id.member_1.toString())
//        btn1.setOnClickListener{
//            val intent = Intent(this, ImageInsideActivity::class.java)
//            startActivity(intent)
//        }
        var resIDs = Array<Int>(9, {0})
        var buttons = arrayOfNulls<ImageView>(9)

        for(i in 0..8) {
            var resID = resources.getIdentifier(
                "member_" + (i+1),
                "id",
                packageName
            )
//            var picID = resources.getIdentifier(
//                "member_$i",
//                "drawable",
//                packageName
//            )
            resIDs[i] = resID
            buttons[i] = findViewById<ImageView>(resIDs[i])
            buttons[i]?.setOnClickListener{
                val intent = Intent(this, ImageInsideActivity::class.java)
                intent.putExtra("index", i+1)
                startActivity(intent)
            }
            Log.e("Check", resIDs[i].toString())

        }
    }
}
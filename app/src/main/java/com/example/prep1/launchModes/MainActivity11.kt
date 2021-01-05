package com.example.prep1.launchModes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.activity_main10.act10
import kotlinx.android.synthetic.main.activity_main11.*

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)


        act11.setOnClickListener {
            var intent= Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }


        act111.setOnClickListener {
            var intent= Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }
    }
}
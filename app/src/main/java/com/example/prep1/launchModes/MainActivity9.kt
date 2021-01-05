package com.example.prep1.launchModes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main8.*
import kotlinx.android.synthetic.main.activity_main9.*

class MainActivity9 : AppCompatActivity() {

    var a=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        act9.setOnClickListener {
            var intent=Intent(this,MainActivity10::class.java)
//            a++
//            intent.putExtra("key",a)
            startActivity(intent)
        }
    }

//    override fun onNewIntent(intent: Intent?) {
//        super.onNewIntent(intent)
//        var b=intent!!.getIntExtra("key",0)
//        act9.setText("value"+b)
//    }
}
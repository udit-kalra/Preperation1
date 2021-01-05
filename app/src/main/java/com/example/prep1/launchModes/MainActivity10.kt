package com.example.prep1.launchModes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.activity_main9.*

class MainActivity10 : AppCompatActivity() {

    var a=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        act10.setOnClickListener {
            var intent=Intent(this,MainActivity11::class.java)
//            a++
//            intent.putExtra("key",a)
            startActivity(intent)
        }

//        var myIntent=intent.getIntExtra("key",0)
//        act10.setText("vallllllllll"+myIntent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        var b=intent!!.getIntExtra("key",0)
        act10.setText("value"+b)
    }

}
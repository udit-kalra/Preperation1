package com.example.prep1.viewModelLearn

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main4.*
import java.util.EnumSet.of


class MainActivity4 : AppCompatActivity() {

    var mainViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        clickMe1.setText(""+mainViewModel!!.getCurrentCountA())
        clickMe2.setText(""+mainViewModel!!.getCurrentCountB())

        clickMe1.setOnClickListener {
            clickMe1.setText(""+mainViewModel!!.getCurrentCountA())
        }

        clickMe2.setOnClickListener {
            clickMe2.setText(""+mainViewModel!!.getCurrentCountB())
        }

    }
}
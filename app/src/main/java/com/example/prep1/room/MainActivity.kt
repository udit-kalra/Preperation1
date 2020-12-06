package com.example.prep1.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMe.setOnClickListener {
            doSomething1()
        }
    }

    fun doSomething1(){
        val db = AppDatabase(this)
        GlobalScope.launch {
            db.todoDao().insertAll(TodoEntity("title1","content1"))

            var data=db.todoDao().getAll()

            var sb= StringBuilder()
            data.forEach {
                sb.append(" ${it.id} , ${it.content} , ${it.title} \n")
            }

            runOnUiThread {
                dbValue.text=sb
            }
        }
    }
}
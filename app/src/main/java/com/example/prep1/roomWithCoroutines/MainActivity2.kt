package com.example.prep1.roomWithCoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prep1.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        // 1
        val userDao=AppDatabase2.getInstance(applicationContext).userDao()
        GlobalScope.launch {
            userDao.getAll()
        }

        // 2
        val dbHelper = DatabaseHelperImpl(AppDatabase2.getInstance(applicationContext))
        GlobalScope.launch{
            dbHelper.getUser()
            //        dbHelper.insertAll()
        }
    }
}
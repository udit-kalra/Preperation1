package com.example.prep1.roomWithCoroutines

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1)
abstract class AppDatabase2 : RoomDatabase(){

    abstract fun userDao():UserDao

    companion object {

            private var Instance: AppDatabase2? = null

            fun getInstance(context: Context): AppDatabase2 {

                if (Instance == null) {
                    synchronized(AppDatabase2::class) {
                        Instance = buildRoomDb(context)
                    }
                }
                return Instance!!
            }

            private fun buildRoomDb(context: Context) =
                Room.databaseBuilder(context.applicationContext, AppDatabase2::class.java, "roomdb")
                    .build()

    }
}
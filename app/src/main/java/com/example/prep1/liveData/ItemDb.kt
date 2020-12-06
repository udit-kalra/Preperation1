package com.example.prep1.liveData

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ItemResult::class), version = 1)
abstract class ItemDb : RoomDatabase() {

    abstract fun itemDao():ItemDao

    companion object{

        private var instance:ItemDb?=null

        fun getInstance(context: Context) : ItemDb{

            if(instance==null){
                synchronized(ItemDb){
                    instance=buildRoomDb(context)
                }
            }
                return instance!!

        }


        fun buildRoomDb(context: Context)=
            Room.databaseBuilder(context.applicationContext,ItemDb::class.java,"ItemDb").build()
    }
}
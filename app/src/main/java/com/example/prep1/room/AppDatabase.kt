package com.example.prep1.room

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.prep1.roomWithCoroutines.AppDatabase2

@Database(entities = arrayOf(TodoEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao():TodoDao

    companion object {
        @Volatile private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            AppDatabase::class.java, "todo-list.db")
            .build()
    }



    // This one is easy*
//    companion object {
//
//        private var Instance: AppDatabase2? = null
//
//        fun getInstance(context: Context): AppDatabase2 {
//
//            if (Instance == null) {
//                synchronized(AppDatabase2::class) {
//                    Instance = buildRoomDb(context)
//                }
//            }
//            return Instance!!
//        }
//
//        private fun buildRoomDb(context: Context) =
//            Room.databaseBuilder(context.applicationContext, AppDatabase2::class.java, "roomdb")
//                .build()
//
//    }

}
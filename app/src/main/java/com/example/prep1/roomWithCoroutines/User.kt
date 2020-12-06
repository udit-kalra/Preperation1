package com.example.prep1.roomWithCoroutines

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val id:Int,
    @ColumnInfo(name= "name") val name:String,
    @ColumnInfo(name="email") val email:String,
     val avatar:String)
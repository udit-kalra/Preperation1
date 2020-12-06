package com.example.prep1.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class TodoEntity(title:String,content:String){

    @PrimaryKey(autoGenerate = true)
    var id:Int=0

    @ColumnInfo(name= "title") var title:String?=title

    @ColumnInfo(name = "Content") var content:String?=content
}
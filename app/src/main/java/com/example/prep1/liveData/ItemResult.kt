package com.example.prep1.liveData

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ItemResult {

    @PrimaryKey(autoGenerate = true)
    var id:Int=0

    @ColumnInfo (name="name") var name:String?=null

    @ColumnInfo (name="age") var age:String?=null
}
package com.example.prep1.roomWithCoroutines

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("Select * from User")
    suspend fun getAll():List<User>

    @Insert
    suspend fun insertAll(users:List<User>)

    @Delete
    suspend fun delete(user:User)
}
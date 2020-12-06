package com.example.prep1.roomWithCoroutines

interface DatabaseHelper {

    suspend fun getUser():List<User>

    suspend fun insertAll(users:List<User>)
}
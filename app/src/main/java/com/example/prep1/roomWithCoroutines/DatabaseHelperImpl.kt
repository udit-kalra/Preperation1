package com.example.prep1.roomWithCoroutines

class DatabaseHelperImpl(private val appDatabase2: AppDatabase2):DatabaseHelper {

    override suspend fun getUser(): List<User> =appDatabase2.userDao().getAll()

    override suspend fun insertAll(users: List<User>) =appDatabase2.userDao().insertAll(users)
}
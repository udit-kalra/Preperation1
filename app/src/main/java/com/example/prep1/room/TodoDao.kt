package com.example.prep1.room

import androidx.room.*

@Dao
interface TodoDao {

    @Query("Select * from todoentity")
    suspend fun getAll():List<TodoEntity>

    @Query("Select * From TodoEntity where title like :title")
    suspend fun findByTitle(title:String):TodoEntity

    @Insert
    suspend fun insertAll(vararg todoEntity: TodoEntity)

    @Insert
    suspend fun insert(todoEntity: TodoEntity)

    @Delete
    suspend fun delete(todoEntity:TodoEntity)

    @Update
    suspend fun updateTodo(vararg todos:TodoEntity)

    @Query("Delete from TodoEntity")
    fun deleteAll()
}
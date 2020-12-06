package com.example.prep1.liveData

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface ItemDao {

    @Query("Select * from ItemResult")
    suspend fun getItems():LiveData<List<ItemResult>>

    @Insert
    suspend fun addItem(itemResult: ItemResult)

    @Delete
    suspend fun deleteItem(itemResult: ItemResult)

    @Update
    suspend fun updateItem(itemResult: ItemResult)
}
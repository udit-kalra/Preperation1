package com.example.prep1.liveData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CartViewModel(application: Application) : AndroidViewModel(application) {


    var itemDao:ItemDao
    lateinit var itemList:LiveData<List<ItemResult>>

    init {
        itemDao=ItemDb.getInstance(application).itemDao()
        viewModelScope.launch {
            itemList=itemDao.getItems()

        }
    }

    fun insert(itemResult: ItemResult){
        viewModelScope.launch {
            itemDao.addItem(itemResult)
        }
    }

    fun delete(itemResult: ItemResult){
        viewModelScope.launch {
            itemDao.deleteItem(itemResult)
        }
    }


    fun update(itemResult: ItemResult){
        viewModelScope.launch {
            itemDao.updateItem(itemResult)
        }
    }

}
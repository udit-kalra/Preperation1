package com.example.prep1.roomWithCoroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RoomDBViewModel(private val dbHelper: DatabaseHelper):ViewModel() {

    init {
        fetchUsers()
    }


    private fun fetchUsers() {
        viewModelScope.launch {
            try {
                val usersFromDb = dbHelper.getUser()

                // here you have your usersFromDb

            } catch (e: Exception) {
                // handler error
            }
        }
    }
}
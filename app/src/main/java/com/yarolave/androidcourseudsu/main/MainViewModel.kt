package com.yarolave.androidcourseudsu.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _userList: MutableLiveData<String> = MutableLiveData()
    val userList: LiveData<String> = _userList

    init {
        val thread = Thread {
            Thread.sleep(3000)
            _userList.postValue("GoodBye Hell!")
        }
        thread.start()
    }
}
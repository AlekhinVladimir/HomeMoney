package com.example.homemoney.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _navigateToMenuScreenEvent = MutableLiveData<Boolean>()
    val navigateToMenuScreenEvent: LiveData<Boolean> = _navigateToMenuScreenEvent

    fun onStartButtonClicked() {
        _navigateToMenuScreenEvent.value = true
    }

    fun doneNavigatingToMenuScreen() {
        _navigateToMenuScreenEvent.value = false
    }
}
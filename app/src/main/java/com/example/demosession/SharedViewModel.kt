package com.example.demosession

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private val _messageReceiver = MutableLiveData<String>()
    val messageReceiver: LiveData<String>
        get() = _messageReceiver


    private var messageCounter = 0

    fun sendMessage() {
        ++messageCounter
        _messageReceiver.postValue("Message No: $messageCounter")
    }

    override fun onCleared() {
        super.onCleared()

    }
}
package com.example.demosession.demolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demosession.DemoUser

class DemoViewModel: ViewModel() {

    private val userDemoDataList = mutableListOf<DemoUser>()

    private val _userListLiveData = MutableLiveData<List<DemoUser>>()
    val userListLiveData: LiveData<List<DemoUser>>
        get() = _userListLiveData

    private val _userAddedLiveData = MutableLiveData<List<DemoUser>>()
    val userAddedLiveData: LiveData<List<DemoUser>>
        get() = _userAddedLiveData

    private val _userRemovedLiveData = MutableLiveData<Int>()
    val userRemovedLiveData: LiveData<Int>
        get() = _userRemovedLiveData

    init {
        userDemoDataList.add(DemoUser("Test User 1", "121313"))
        userDemoDataList.add(DemoUser("Test User 2", "121313"))
        userDemoDataList.add(DemoUser("Test User 3", "121313"))
        userDemoDataList.add(DemoUser("Test User 4", "121313"))
        userDemoDataList.add(DemoUser("Test User 5", "121313"))
        userDemoDataList.add(DemoUser("Test User 6", "121313"))
        userDemoDataList.add(DemoUser("Test User 7", "121313"))
        userDemoDataList.add(DemoUser("Test User 8", "121313"))
        userDemoDataList.add(DemoUser("Test User 9", "121313"))
        userDemoDataList.add(DemoUser("Test User 10", "121313"))
        userDemoDataList.add(DemoUser("Test User 11", "121313"))
        userDemoDataList.add(DemoUser("Test User 12", "121313"))
        userDemoDataList.add(DemoUser("Test User 13", "121313"))
        userDemoDataList.add(DemoUser("Test User 14", "121313"))
        userDemoDataList.add(DemoUser("Test User 15", "121313"))
        userDemoDataList.add(DemoUser("Test User 16", "121313"))
        userDemoDataList.add(DemoUser("Test User 17", "121313"))
        userDemoDataList.add(DemoUser("Test User 18", "121313"))
    }

    fun getUserDemoData() {
        _userListLiveData.value = userDemoDataList
    }

    fun addDemoUser(username: String, number: String) {
        userDemoDataList.add(DemoUser(username, number))
        _userAddedLiveData.value = userDemoDataList
    }

    fun removeDemoUser(position: Int) {
        userDemoDataList.removeAt(position)
        _userRemovedLiveData.value = position
    }
}
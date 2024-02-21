package com.example.demosession.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.demosession.DemoUser

@Dao
interface DemoUserDao {

    @Query("select * from DemoUser")
    fun getDemoUsers(): List<DemoUser>

    @Insert
    fun insert(user: DemoUser): Long

    @Delete
    fun delete(user: DemoUser)
}
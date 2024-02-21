package com.example.demosession.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.demosession.DemoUser

@Database(entities = [DemoUser::class], version = 1)
abstract class DemoAppDatabase: RoomDatabase() {
    abstract fun demoUserDao(): DemoUserDao
}
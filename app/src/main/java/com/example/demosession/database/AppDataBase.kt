package com.example.demosession.database

import android.app.Application
import androidx.room.Room

object AppDataBase {

    private var database: DemoAppDatabase? = null
    fun getDataBase(context: Application):DemoAppDatabase {
        if (database == null) {
            database = Room.databaseBuilder(
                context,
                DemoAppDatabase::class.java,
                "demo-app.db"
            ).build()
        }
        return database!!
    }
}
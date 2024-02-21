package com.example.demosession

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class DemoUser(
    var name: String? = null,
    var userId: String? = null
)
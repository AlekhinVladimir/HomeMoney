package com.example.homemoney.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val amount: Double,
    val category: String,
    val type: String,
    val comment: String,
    val timestamp: Long = System.currentTimeMillis()
)
package com.example.overwatchcounters

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.LocalTime

@Entity(tableName = "character_table")
class Character(
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "counters") var list: List<Int>,

    @PrimaryKey(autoGenerate = true) var id: Int = 0
)

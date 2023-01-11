package com.example.overwatchcounters

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "correspondence_table")
class Correspondence (
    @PrimaryKey() var id: String,
    @ColumnInfo(name = "counter1") var counter1: String,
    @ColumnInfo(name = "counter2") var counter2: String,
    @ColumnInfo(name = "counter3") var counter3: String
)

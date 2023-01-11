package com.example.overwatchcounters

import android.widget.ImageView
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "character_table")
class Character(
    @PrimaryKey() var id: String,
    @ColumnInfo(name = "role") var role: String,
    @ColumnInfo(name = "image") var imagePath: String
)

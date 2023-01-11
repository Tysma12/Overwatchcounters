package com.example.overwatchcounters

import android.app.Application

class TodoApplication : Application()
{
    private val database by lazy { CharacterDatabase.getDatabase(this) }
    //val repository by lazy { CharacterRepository(database.CharacterDao()) }
}
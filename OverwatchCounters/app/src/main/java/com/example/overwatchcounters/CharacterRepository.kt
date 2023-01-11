package com.example.overwatchcounters

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class CharacterRepository(private val CharacterDao: CharacterDao)
{
    val allCharacters: Flow<List<Character>> = CharacterDao.allCharacters()
    //val findCharacter: Character = CharacterDao.findCharacter()

    @WorkerThread
    suspend fun insertCharacter(Character: Character)
    {
        CharacterDao.insertCharacter(Character)
    }

    @WorkerThread
    suspend fun updateCharacter(Character: Character)
    {
        CharacterDao.updateCharacter(Character)
    }
}
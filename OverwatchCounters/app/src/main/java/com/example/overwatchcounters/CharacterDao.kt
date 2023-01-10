package com.example.overwatchcounters

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao
{
    @Query("SELECT * FROM character_table ORDER BY id ASC")
    fun allCharacters(): Flow<List<Character>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacter(Character: Character)

    @Update
    suspend fun updateCharacter(Character: Character)

    @Delete
    suspend fun deleteCharacter(Character: Character)
}
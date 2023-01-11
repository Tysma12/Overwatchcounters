package com.example.overwatchcounters

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao
{
    @Query("SELECT * FROM character_table ORDER BY id ASC")
    fun allCharacters(): Flow<List<Character>>

    //@Query("SELECT * FROM character_table WHERE id = :id")
    //fun findCharacter(id: Character.id)

    //@Query("SELECT * FROM correspondence_table WHERE id = :id")
    //fun findCounters(id: Character.id)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacter(Character: Character)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCorrespondence(Correspondence: Correspondence)

    @Update
    suspend fun updateCharacter(Character: Character)

    @Delete
    suspend fun deleteCharacter(Character: Character)
}
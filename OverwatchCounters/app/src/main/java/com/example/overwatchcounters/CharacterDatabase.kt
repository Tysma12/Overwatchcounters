package com.example.overwatchcounters

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Character::class, Correspondence::class], version = 1, exportSchema = false)
public abstract class CharacterDatabase () : RoomDatabase()
{
    abstract fun characterDao(): CharacterDao
    suspend fun prepopulateDatabase() {

        val Ana_name = "Ana"
        val Ana_role = "Support"
        val Ana_imagePath = "app/src/debug/res/mipmap-xxxhdpi/ana.png"
        val Ana_counter1 = "Zen"
        val Ana_counter2 = "Dva"
        val Ana_counter3 = "Reinhardt"

        val Zen_name = "Zen"
        val Zen_role = "Support"
        val Zen_imagePath = "app/src/debug/res/mipmap-xxxhdpi/zen.png"
        val Zen_counter1 = "Ana"
        val Zen_counter2 = "Dva"
        val Zen_counter3 = "Reinhardt"

        val Dva_name = "Dva"
        val Dva_role = "Tank"
        val Dva_imagePath = "app/src/debug/res/mipmap-xxxhdpi/dva.png"
        val Dva_counter1 = "Zen"
        val Dva_counter2 = "Ana"
        val Dva_counter3 = "Reinhardt"

        val Reinhardt_name = "Reinhardt"
        val Reinhardt_role = "Tank"
        val Reinhardt_imagePath = "app/src/debug/res/mipmap-xxxhdpi/reinhardt.png"
        val Reinhardt_counter1 = "Zen"
        val Reinhardt_counter2 = "Dva"
        val Reinhardt_counter3 = "Ana"


        val Ana: Character = Character(Ana_name, Ana_role, Ana_imagePath)
        val Zen: Character = Character(Zen_name, Zen_role, Zen_imagePath)
        val Dva: Character = Character(Dva_name, Dva_role, Dva_imagePath)
        val Reinhardt: Character = Character(Reinhardt_name, Reinhardt_role, Reinhardt_imagePath)

        val Ana_correspondence: Correspondence = Correspondence(Ana_name, Ana_counter1, Ana_counter2, Ana_counter3)
        val Zen_correspondence: Correspondence = Correspondence(Zen_name, Zen_counter1, Zen_counter2, Zen_counter3)
        val Dva_correspondence: Correspondence = Correspondence(Dva_name, Dva_counter1, Dva_counter2, Dva_counter3)
        val Reinhardt_correspondence: Correspondence = Correspondence(Reinhardt_name, Reinhardt_counter1, Reinhardt_counter2, Reinhardt_counter3)

        characterDao().insertCharacter(Ana)
        characterDao().insertCharacter(Zen)
        characterDao().insertCharacter(Dva)
        characterDao().insertCharacter(Reinhardt)

        characterDao().insertCorrespondence(Ana_correspondence)
        characterDao().insertCorrespondence(Zen_correspondence)
        characterDao().insertCorrespondence(Dva_correspondence)
        characterDao().insertCorrespondence(Reinhardt_correspondence)
    }

    companion object
    {
        @Volatile
        private var INSTANCE: CharacterDatabase? = null

        fun getDatabase(context: Context): CharacterDatabase
        {
            return INSTANCE ?: synchronized(this)
            {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CharacterDatabase::class.java,
                    "character_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
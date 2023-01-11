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
        val Ana_counter3 = "Roadhog"

        val Zen_name = "Zen"
        val Zen_role = "Support"
        val Zen_imagePath = "app/src/debug/res/mipmap-xxxhdpi/zen.png"
        val Zen_counter1 = "Ana"
        val Zen_counter2 = "Dva"
        val Zen_counter3 = "Roadhog"

        val Dva_name = "Dva"
        val Dva_role = "Tank"
        val Dva_imagePath = "app/src/debug/res/mipmap-xxxhdpi/dva.png"
        val Dva_counter1 = "Zen"
        val Dva_counter2 = "Ana"
        val Dva_counter3 = "Roadhog"

        val Roadhog_name = "Roadhog"
        val Roadhog_role = "Tank"
        val Roadhog_imagePath = "app/src/debug/res/mipmap-xxxhdpi/roadhog.png"
        val Roadhog_counter1 = "Zen"
        val Roadhog_counter2 = "Dva"
        val Roadhog_counter3 = "Ana"

        val Genji_name = "Genji"
        val Genji_role = "DPS"
        val Genji_imagePath = "app/src/debug/res/mipmap-xxxhdpi/Genji.png"
        val Genji_counter1 = "Zen"
        val Genji_counter2 = "Dva"
        val Genji_counter3 = "Roadhog"

        val Ana: Character = Character(Ana_name, Ana_role, Ana_imagePath)
        val Zen: Character = Character(Zen_name, Zen_role, Zen_imagePath)
        val Dva: Character = Character(Dva_name, Dva_role, Dva_imagePath)
        val Roadhog: Character = Character(Roadhog_name, Roadhog_role, Roadhog_imagePath)
        val Genji: Character = Character(Genji_name, Genji_role, Genji_imagePath)

        val Ana_correspondence: Correspondence = Correspondence(Ana_name, Ana_counter1, Ana_counter2, Ana_counter3)
        val Zen_correspondence: Correspondence = Correspondence(Zen_name, Zen_counter1, Zen_counter2, Zen_counter3)
        val Dva_correspondence: Correspondence = Correspondence(Dva_name, Dva_counter1, Dva_counter2, Dva_counter3)
        val Roadhog_correspondence: Correspondence = Correspondence(Roadhog_name, Roadhog_counter1, Roadhog_counter2, Roadhog_counter3)
        val Genji_correspondence: Correspondence = Correspondence(Genji_name, Genji_counter1, Genji_counter2, Genji_counter3)

        characterDao().insertCharacter(Ana)
        characterDao().insertCharacter(Zen)
        characterDao().insertCharacter(Dva)
        characterDao().insertCharacter(Roadhog)
        characterDao().insertCharacter(Genji)

        characterDao().insertCorrespondence(Ana_correspondence)
        characterDao().insertCorrespondence(Zen_correspondence)
        characterDao().insertCorrespondence(Dva_correspondence)
        characterDao().insertCorrespondence(Roadhog_correspondence)
        characterDao().insertCorrespondence(Genji_correspondence)
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
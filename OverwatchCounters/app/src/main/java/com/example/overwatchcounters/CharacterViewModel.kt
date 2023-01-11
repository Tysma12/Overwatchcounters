package com.example.overwatchcounters

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class CharacterViewModel(private val repository: CharacterRepository): ViewModel()
{
    val taskItems: LiveData<List<Character>> = repository.allCharacters.asLiveData()

    fun addCharacter(taskItem: Character) = viewModelScope.launch {
        repository.insertCharacter(taskItem)
    }

    fun updateCharacter(taskItem: Character) = viewModelScope.launch {
        repository.updateCharacter(taskItem)
    }

}

class TaskItemModelFactory(private val repository: CharacterRepository) : ViewModelProvider.Factory {
    override fun <C : ViewModel> create(modelClass: Class<C>): C {
        if (modelClass.isAssignableFrom(CharacterViewModel::class.java))
            return CharacterViewModel(repository) as C

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
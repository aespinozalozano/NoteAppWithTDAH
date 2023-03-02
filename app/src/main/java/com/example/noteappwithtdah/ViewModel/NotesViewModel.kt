package com.example.noteappwithtdah.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.noteappwithtdah.Database.NotesDataBase
import com.example.noteappwithtdah.Model.Notes
import com.example.noteappwithtdah.Repository.NotesRepository

class NotesViewModel (application: Application): AndroidViewModel(application) {

    val repository: NotesRepository

    init {
        val dao=NotesDataBase.getDatabaseInstance(application).myNotesDao()
        repository=NotesRepository(dao)
    }
    fun addNotes(notes: Notes) {
        repository.insertNotes(notes)
    }
    fun getNotes(): LiveData<List<Notes>> = repository.getAllNotes()

    fun deleteNotes(id: Int) {
        repository.deleteNotes(id)
    }
    fun updateNotes(notes: Notes) {
        repository.updateNotes(notes)
    }

}
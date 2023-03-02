package com.example.noteappwithtdah.Dao

import android.os.FileObserver.DELETE
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.noteappwithtdah.Model.Notes


@Dao
interface NotesDao {

    @Query("SELECT ★ FROM Notes")
    fun getNotes():LiveData<List<Notes>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(notes:Notes)

    @Query("DELETE FROM Notes WHERE id:id" )
    fun deleteNotes(id:Int)
    @Update
    fun updateNotes(notes: Notes)
}
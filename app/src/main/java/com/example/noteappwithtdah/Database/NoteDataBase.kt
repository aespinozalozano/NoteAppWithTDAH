package com.example.noteappwithtdah.Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteappwithtdah.Dao.NotesDao
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

abstract class NotesDataBase : RoomDatabase() {

    abstract fun myNotesDao(): NotesDao

    companion object {
        @Volatile
        var INSTANCE:NotesDataBase?=null

        @OptIn(InternalCoroutinesApi::class)
        fun getDatabaseInstance(context: Context):NotesDataBase {

            val tempInstnce = INSTANCE
            if (tempInstnce!=null){
                return tempInstnce
            }
            synchronized(this)
            {
                val roomDatabaseInstance=Room.
                databaseBuilder(context, NotesDataBase::class.java, "Notes").build()
                INSTANCE=roomDatabaseInstance
                return return roomDatabaseInstance
            }
        }
    }

}
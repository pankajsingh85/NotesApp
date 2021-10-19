package com.pankaj.notesappkotlin

import androidx.lifecycle.LiveData
import androidx.room.Delete

class NoteRepository(private val noteDao: NoteDao) {
    val allNotes: LiveData<List<Notes>> =noteDao.getAllNotes()


    suspend fun insert(note:Notes){
        noteDao.insert(note)
    }

    suspend fun delete(note: Notes){
        noteDao.delete(note)
    }

}

package com.lucaspetrocini.notes.feature.data.repository

import com.lucaspetrocini.notes.feature.data.database.dao.NoteDao
import com.lucaspetrocini.notes.feature.domain.model.Note
import com.lucaspetrocini.notes.feature.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getAllNotes(): Flow<List<Note>> {
        return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}
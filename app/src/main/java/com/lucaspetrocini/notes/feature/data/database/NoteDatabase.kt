package com.lucaspetrocini.notes.feature.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lucaspetrocini.notes.feature.data.database.dao.NoteDao
import com.lucaspetrocini.notes.feature.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
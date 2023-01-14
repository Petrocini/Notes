package com.lucaspetrocini.notes.di

import androidx.room.Room
import com.lucaspetrocini.notes.Application
import com.lucaspetrocini.notes.feature.data.database.NoteDatabase
import com.lucaspetrocini.notes.feature.data.database.dao.NoteDao
import com.lucaspetrocini.notes.feature.data.repository.NoteRepositoryImpl
import com.lucaspetrocini.notes.feature.domain.repository.NoteRepository
import com.lucaspetrocini.notes.feature.domain.usecase.AddNoteUseCase
import com.lucaspetrocini.notes.feature.domain.usecase.DeleteNoteUseCase
import com.lucaspetrocini.notes.feature.domain.usecase.GetAllNotesUseCase
import com.lucaspetrocini.notes.feature.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getAllNotes = GetAllNotesUseCase(repository),
            deleteNote = DeleteNoteUseCase(repository),
            addNote = AddNoteUseCase(repository)
        )
    }

}
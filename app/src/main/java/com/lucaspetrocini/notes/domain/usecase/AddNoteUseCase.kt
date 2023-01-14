package com.lucaspetrocini.notes.domain.usecase

import com.lucaspetrocini.notes.domain.model.InvalidNoteException
import com.lucaspetrocini.notes.domain.model.Note
import com.lucaspetrocini.notes.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        when {
            note.title.isBlank() -> throw InvalidNoteException("The title of the note can't be empty.")
            note.content.isBlank() -> throw InvalidNoteException("The title of the note can't be empty.")
            else -> repository.insertNote(note)
        }
    }
}
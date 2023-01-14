package com.lucaspetrocini.notes.domain.usecase

import com.lucaspetrocini.notes.domain.model.Note
import com.lucaspetrocini.notes.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}
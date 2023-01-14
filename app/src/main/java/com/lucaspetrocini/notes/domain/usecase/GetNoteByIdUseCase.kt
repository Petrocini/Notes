package com.lucaspetrocini.notes.domain.usecase

import com.lucaspetrocini.notes.domain.model.Note
import com.lucaspetrocini.notes.domain.repository.NoteRepository

class GetNoteByIdUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}
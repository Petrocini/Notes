package com.lucaspetrocini.notes.feature.domain.usecase

import com.lucaspetrocini.notes.feature.domain.model.Note
import com.lucaspetrocini.notes.feature.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}
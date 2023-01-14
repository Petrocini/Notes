package com.lucaspetrocini.notes.feature.domain.usecase

import com.lucaspetrocini.notes.feature.domain.model.Note

data class NoteUseCases(
    val getAllNotes: GetAllNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNoteById: GetNoteByIdUseCase
)

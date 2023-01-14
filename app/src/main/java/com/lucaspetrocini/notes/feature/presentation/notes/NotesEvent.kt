package com.lucaspetrocini.notes.feature.presentation.notes

import com.lucaspetrocini.notes.feature.domain.model.Note
import com.lucaspetrocini.notes.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

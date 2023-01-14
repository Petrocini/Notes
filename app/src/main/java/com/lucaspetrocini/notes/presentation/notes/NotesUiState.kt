package com.lucaspetrocini.notes.presentation.notes

import com.lucaspetrocini.notes.domain.model.Note
import com.lucaspetrocini.notes.domain.util.NoteOrder
import com.lucaspetrocini.notes.domain.util.OrderType

data class NotesUiState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

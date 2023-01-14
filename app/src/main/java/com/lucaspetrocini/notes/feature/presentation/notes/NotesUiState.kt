package com.lucaspetrocini.notes.feature.presentation.notes

import com.lucaspetrocini.notes.feature.domain.model.Note
import com.lucaspetrocini.notes.feature.domain.util.NoteOrder
import com.lucaspetrocini.notes.feature.domain.util.OrderType

data class NotesUiState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

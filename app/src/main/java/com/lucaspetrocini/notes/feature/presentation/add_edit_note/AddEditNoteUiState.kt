package com.lucaspetrocini.notes.feature.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteUiState {
    data class EnteredTitle(val value: String): AddEditNoteUiState()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteUiState()
    data class EnteredContent(val value: String): AddEditNoteUiState()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteUiState()
    data class ChangeColor(val color: Int): AddEditNoteUiState()
    object SaveNote: AddEditNoteUiState()
}
package com.lucaspetrocini.notes.feature.presentation.add_edit_note

import androidx.lifecycle.ViewModel
import com.lucaspetrocini.notes.feature.domain.usecase.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {



}
package com.kironstylo.notetakingapp.feature_note.domain.use_case

import com.kironstylo.notetakingapp.feature_note.domain.model.Note
import com.kironstylo.notetakingapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}
package com.kironstylo.notetakingapp.feature_note.presentation.util

sealed class Screen (val route: String){
    object NoteScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screeen")
}
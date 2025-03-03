package com.kironstylo.notetakingapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kironstylo.notetakingapp.feature_note.domain.model.Note


@Database(
    entities = [Note::class],
    version = 1

)
abstract class NoteDB : RoomDatabase() {
    abstract val noteDao: NoteDao
}
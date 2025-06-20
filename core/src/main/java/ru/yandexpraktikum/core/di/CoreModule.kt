package ru.yandexpraktikum.core.di

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.yandexpraktikum.core.data.db.NoteDao
import ru.yandexpraktikum.core.data.db.NoteDatabase
import ru.yandexpraktikum.core.data.repository.NotesRepositoryImpl
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import javax.inject.Singleton


private const val DATABASE_NAME = "note-database"

@Module
interface CoreModule {
    @Binds
    @Singleton
    fun bindRepository(repositoryImpl: NotesRepositoryImpl): NotesRepository

    companion object {

        @Provides
        @Singleton
        fun provideNoteDatabase(context: Context): NoteDatabase {
            return Room.databaseBuilder(
                context = context,
                klass = NoteDatabase::class.java,
                name = DATABASE_NAME
            ).build()
        }

        @Provides
        @Singleton
        fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao {
            return noteDatabase.noteDao()
        }
    }
}


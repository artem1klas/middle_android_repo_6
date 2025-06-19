package ru.yandexpraktikum.core.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lru/yandexpraktikum/core/di/CoreModule;", "", "bindRepository", "Lru/yandexpraktikum/core/domain/repository/NotesRepository;", "repositoryImpl", "Lru/yandexpraktikum/core/data/repository/NotesRepositoryImpl;", "Companion", "core_debug"})
public abstract interface CoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.yandexpraktikum.core.di.CoreModule.Companion Companion = null;
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract ru.yandexpraktikum.core.domain.repository.NotesRepository bindRepository(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.data.repository.NotesRepositoryImpl repositoryImpl);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lru/yandexpraktikum/core/di/CoreModule$Companion;", "", "()V", "provideNoteDao", "Lru/yandexpraktikum/core/data/db/NoteDao;", "noteDatabase", "Lru/yandexpraktikum/core/data/db/NoteDatabase;", "provideNoteDatabase", "context", "Landroid/content/Context;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @dagger.Provides()
        @javax.inject.Singleton()
        @org.jetbrains.annotations.NotNull()
        public final ru.yandexpraktikum.core.data.db.NoteDatabase provideNoteDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @dagger.Provides()
        @javax.inject.Singleton()
        @org.jetbrains.annotations.NotNull()
        public final ru.yandexpraktikum.core.data.db.NoteDao provideNoteDao(@org.jetbrains.annotations.NotNull()
        ru.yandexpraktikum.core.data.db.NoteDatabase noteDatabase) {
            return null;
        }
    }
}
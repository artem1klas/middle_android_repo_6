package ru.yandexpraktikum.core.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lru/yandexpraktikum/core/di/CoreContainer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataMapper", "Lru/yandexpraktikum/core/data/mappers/DataNoteMapper;", "noteDatabase", "Lru/yandexpraktikum/core/data/db/NoteDatabase;", "presentationMapper", "Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;", "getPresentationMapper", "()Lru/yandexpraktikum/core/presentation/mappers/PresentationNoteMapper;", "repository", "Lru/yandexpraktikum/core/data/repository/NotesRepositoryImpl;", "getRepository", "()Lru/yandexpraktikum/core/data/repository/NotesRepositoryImpl;", "core_debug"})
public final class CoreContainer {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.data.db.NoteDatabase noteDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.data.mappers.DataNoteMapper dataMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper presentationMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.data.repository.NotesRepositoryImpl repository = null;
    
    public CoreContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper getPresentationMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.yandexpraktikum.core.data.repository.NotesRepositoryImpl getRepository() {
        return null;
    }
}
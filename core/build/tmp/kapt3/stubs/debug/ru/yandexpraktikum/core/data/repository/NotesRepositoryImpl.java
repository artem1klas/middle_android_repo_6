package ru.yandexpraktikum.core.data.repository;

/**
 * TODO("Add documentation")
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/yandexpraktikum/core/data/repository/NotesRepositoryImpl;", "Lru/yandexpraktikum/core/domain/repository/NotesRepository;", "noteDao", "Lru/yandexpraktikum/core/data/db/NoteDao;", "noteMapper", "Lru/yandexpraktikum/core/data/mappers/DataNoteMapper;", "(Lru/yandexpraktikum/core/data/db/NoteDao;Lru/yandexpraktikum/core/data/mappers/DataNoteMapper;)V", "deleteNote", "", "note", "Lru/yandexpraktikum/core/domain/model/Note;", "(Lru/yandexpraktikum/core/domain/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNoteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNote", "updateNote", "core_debug"})
public final class NotesRepositoryImpl implements ru.yandexpraktikum.core.domain.repository.NotesRepository {
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.data.db.NoteDao noteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.yandexpraktikum.core.data.mappers.DataNoteMapper noteMapper = null;
    
    @javax.inject.Inject()
    public NotesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.data.db.NoteDao noteDao, @org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.data.mappers.DataNoteMapper noteMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    ru.yandexpraktikum.core.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<ru.yandexpraktikum.core.domain.model.Note>> getAllNotes() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getNoteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.yandexpraktikum.core.domain.model.Note> $completion) {
        return null;
    }
}
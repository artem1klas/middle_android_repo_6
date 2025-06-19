package ru.yandexpraktikum.core.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ru.yandexpraktikum.core.data.db.NoteDao;
import ru.yandexpraktikum.core.data.mappers.DataNoteMapper;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class NotesRepositoryImpl_Factory implements Factory<NotesRepositoryImpl> {
  private final Provider<NoteDao> noteDaoProvider;

  private final Provider<DataNoteMapper> noteMapperProvider;

  public NotesRepositoryImpl_Factory(Provider<NoteDao> noteDaoProvider,
      Provider<DataNoteMapper> noteMapperProvider) {
    this.noteDaoProvider = noteDaoProvider;
    this.noteMapperProvider = noteMapperProvider;
  }

  @Override
  public NotesRepositoryImpl get() {
    return newInstance(noteDaoProvider.get(), noteMapperProvider.get());
  }

  public static NotesRepositoryImpl_Factory create(javax.inject.Provider<NoteDao> noteDaoProvider,
      javax.inject.Provider<DataNoteMapper> noteMapperProvider) {
    return new NotesRepositoryImpl_Factory(Providers.asDaggerProvider(noteDaoProvider), Providers.asDaggerProvider(noteMapperProvider));
  }

  public static NotesRepositoryImpl_Factory create(Provider<NoteDao> noteDaoProvider,
      Provider<DataNoteMapper> noteMapperProvider) {
    return new NotesRepositoryImpl_Factory(noteDaoProvider, noteMapperProvider);
  }

  public static NotesRepositoryImpl newInstance(NoteDao noteDao, DataNoteMapper noteMapper) {
    return new NotesRepositoryImpl(noteDao, noteMapper);
  }
}

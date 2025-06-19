package ru.yandexpraktikum.core.data.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class DataNoteMapper_Factory implements Factory<DataNoteMapper> {
  @Override
  public DataNoteMapper get() {
    return newInstance();
  }

  public static DataNoteMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DataNoteMapper newInstance() {
    return new DataNoteMapper();
  }

  private static final class InstanceHolder {
    static final DataNoteMapper_Factory INSTANCE = new DataNoteMapper_Factory();
  }
}

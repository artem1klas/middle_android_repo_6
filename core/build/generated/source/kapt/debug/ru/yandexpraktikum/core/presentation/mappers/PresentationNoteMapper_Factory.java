package ru.yandexpraktikum.core.presentation.mappers;

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
public final class PresentationNoteMapper_Factory implements Factory<PresentationNoteMapper> {
  @Override
  public PresentationNoteMapper get() {
    return newInstance();
  }

  public static PresentationNoteMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PresentationNoteMapper newInstance() {
    return new PresentationNoteMapper();
  }

  private static final class InstanceHolder {
    static final PresentationNoteMapper_Factory INSTANCE = new PresentationNoteMapper_Factory();
  }
}

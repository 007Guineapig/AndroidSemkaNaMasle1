package com.ahmedapps.roomdatabase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/ahmedapps/roomdatabase/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "database", "Lcom/ahmedapps/roomdatabase/data/ReceptsDatabase;", "getDatabase", "()Lcom/ahmedapps/roomdatabase/data/ReceptsDatabase;", "setDatabase", "(Lcom/ahmedapps/roomdatabase/data/ReceptsDatabase;)V", "viewModel", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsViewModel;", "getViewModel", "()Lcom/ahmedapps/roomdatabase/presentation/ReceptsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "provideNotesDatabase", "context", "Landroid/content/Context;", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    public com.ahmedapps.roomdatabase.data.ReceptsDatabase database;
    
    public MainActivity() {
        super();
    }
    
    private final com.ahmedapps.roomdatabase.presentation.ReceptsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahmedapps.roomdatabase.data.ReceptsDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull
    com.ahmedapps.roomdatabase.data.ReceptsDatabase p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @com.google.android.datatransport.runtime.dagger.Provides
    public final com.ahmedapps.roomdatabase.data.ReceptsDatabase provideNotesDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}
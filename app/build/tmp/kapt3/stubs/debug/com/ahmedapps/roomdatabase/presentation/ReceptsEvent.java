package com.ahmedapps.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent;", "", "DeleteRecept", "SaveRecept", "SortRecepts", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$DeleteRecept;", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$SaveRecept;", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$SortRecepts;", "app_debug"})
public abstract interface ReceptsEvent {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$SortRecepts;", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent;", "()V", "app_debug"})
    public static final class SortRecepts implements com.ahmedapps.roomdatabase.presentation.ReceptsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahmedapps.roomdatabase.presentation.ReceptsEvent.SortRecepts INSTANCE = null;
        
        private SortRecepts() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$DeleteRecept;", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent;", "receptik", "Lcom/ahmedapps/roomdatabase/data/Receptik;", "(Lcom/ahmedapps/roomdatabase/data/Receptik;)V", "getReceptik", "()Lcom/ahmedapps/roomdatabase/data/Receptik;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteRecept implements com.ahmedapps.roomdatabase.presentation.ReceptsEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahmedapps.roomdatabase.data.Receptik receptik = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.presentation.ReceptsEvent.DeleteRecept copy(@org.jetbrains.annotations.NotNull
        com.ahmedapps.roomdatabase.data.Receptik receptik) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteRecept(@org.jetbrains.annotations.NotNull
        com.ahmedapps.roomdatabase.data.Receptik receptik) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.data.Receptik component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.data.Receptik getReceptik() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent$SaveRecept;", "Lcom/ahmedapps/roomdatabase/presentation/ReceptsEvent;", "nazov", "", "popis", "postup", "ingrediencie", "kategoria", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIngrediencie", "()Ljava/lang/String;", "getKategoria", "getNazov", "getPopis", "getPostup", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SaveRecept implements com.ahmedapps.roomdatabase.presentation.ReceptsEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String nazov = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String popis = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String postup = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String ingrediencie = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String kategoria = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahmedapps.roomdatabase.presentation.ReceptsEvent.SaveRecept copy(@org.jetbrains.annotations.NotNull
        java.lang.String nazov, @org.jetbrains.annotations.NotNull
        java.lang.String popis, @org.jetbrains.annotations.NotNull
        java.lang.String postup, @org.jetbrains.annotations.NotNull
        java.lang.String ingrediencie, @org.jetbrains.annotations.NotNull
        java.lang.String kategoria) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SaveRecept(@org.jetbrains.annotations.NotNull
        java.lang.String nazov, @org.jetbrains.annotations.NotNull
        java.lang.String popis, @org.jetbrains.annotations.NotNull
        java.lang.String postup, @org.jetbrains.annotations.NotNull
        java.lang.String ingrediencie, @org.jetbrains.annotations.NotNull
        java.lang.String kategoria) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNazov() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPopis() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPostup() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIngrediencie() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKategoria() {
            return null;
        }
    }
}
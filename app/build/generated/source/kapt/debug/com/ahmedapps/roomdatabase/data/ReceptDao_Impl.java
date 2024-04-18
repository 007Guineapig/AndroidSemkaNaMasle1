package com.ahmedapps.roomdatabase.data;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ReceptDao_Impl implements ReceptDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Receptik> __insertionAdapterOfReceptik;

  private final EntityDeletionOrUpdateAdapter<Receptik> __deletionAdapterOfReceptik;

  private final EntityUpsertionAdapter<Receptik> __upsertionAdapterOfReceptik;

  public ReceptDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReceptik = new EntityInsertionAdapter<Receptik>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `Receptik` (`id`,`nazov`,`popis`,`postup`,`ingrediencie`,`kategoria`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Receptik entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNazov() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNazov());
        }
        if (entity.getPopis() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPopis());
        }
        if (entity.getPostup() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPostup());
        }
        if (entity.getIngrediencie() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getIngrediencie());
        }
        if (entity.getKategoria() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getKategoria());
        }
      }
    };
    this.__deletionAdapterOfReceptik = new EntityDeletionOrUpdateAdapter<Receptik>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Receptik` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Receptik entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__upsertionAdapterOfReceptik = new EntityUpsertionAdapter<Receptik>(new EntityInsertionAdapter<Receptik>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `Receptik` (`id`,`nazov`,`popis`,`postup`,`ingrediencie`,`kategoria`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Receptik entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNazov() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNazov());
        }
        if (entity.getPopis() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPopis());
        }
        if (entity.getPostup() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPostup());
        }
        if (entity.getIngrediencie() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getIngrediencie());
        }
        if (entity.getKategoria() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getKategoria());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<Receptik>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `Receptik` SET `id` = ?,`nazov` = ?,`popis` = ?,`postup` = ?,`ingrediencie` = ?,`kategoria` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final Receptik entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNazov() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNazov());
        }
        if (entity.getPopis() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPopis());
        }
        if (entity.getPostup() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPostup());
        }
        if (entity.getIngrediencie() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getIngrediencie());
        }
        if (entity.getKategoria() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getKategoria());
        }
        statement.bindLong(7, entity.getId());
      }
    });
  }

  @Override
  public Object insert(final Receptik receptik, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfReceptik.insert(receptik);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteNote(final Receptik receptik, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfReceptik.handle(receptik);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object upsertNote(final Receptik receptik, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfReceptik.upsert(receptik);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Receptik>> readAll() {
    final String _sql = "SELECT * FROM receptik";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"receptik"}, new Callable<List<Receptik>>() {
      @Override
      @NonNull
      public List<Receptik> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNazov = CursorUtil.getColumnIndexOrThrow(_cursor, "nazov");
          final int _cursorIndexOfPopis = CursorUtil.getColumnIndexOrThrow(_cursor, "popis");
          final int _cursorIndexOfPostup = CursorUtil.getColumnIndexOrThrow(_cursor, "postup");
          final int _cursorIndexOfIngrediencie = CursorUtil.getColumnIndexOrThrow(_cursor, "ingrediencie");
          final int _cursorIndexOfKategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "kategoria");
          final List<Receptik> _result = new ArrayList<Receptik>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Receptik _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNazov;
            if (_cursor.isNull(_cursorIndexOfNazov)) {
              _tmpNazov = null;
            } else {
              _tmpNazov = _cursor.getString(_cursorIndexOfNazov);
            }
            final String _tmpPopis;
            if (_cursor.isNull(_cursorIndexOfPopis)) {
              _tmpPopis = null;
            } else {
              _tmpPopis = _cursor.getString(_cursorIndexOfPopis);
            }
            final String _tmpPostup;
            if (_cursor.isNull(_cursorIndexOfPostup)) {
              _tmpPostup = null;
            } else {
              _tmpPostup = _cursor.getString(_cursorIndexOfPostup);
            }
            final String _tmpIngrediencie;
            if (_cursor.isNull(_cursorIndexOfIngrediencie)) {
              _tmpIngrediencie = null;
            } else {
              _tmpIngrediencie = _cursor.getString(_cursorIndexOfIngrediencie);
            }
            final String _tmpKategoria;
            if (_cursor.isNull(_cursorIndexOfKategoria)) {
              _tmpKategoria = null;
            } else {
              _tmpKategoria = _cursor.getString(_cursorIndexOfKategoria);
            }
            _item = new Receptik(_tmpId,_tmpNazov,_tmpPopis,_tmpPostup,_tmpIngrediencie,_tmpKategoria);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Receptik>> getNotesOrderdByTitle() {
    final String _sql = "SELECT * FROM receptik ORDER BY nazov ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"receptik"}, new Callable<List<Receptik>>() {
      @Override
      @NonNull
      public List<Receptik> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNazov = CursorUtil.getColumnIndexOrThrow(_cursor, "nazov");
          final int _cursorIndexOfPopis = CursorUtil.getColumnIndexOrThrow(_cursor, "popis");
          final int _cursorIndexOfPostup = CursorUtil.getColumnIndexOrThrow(_cursor, "postup");
          final int _cursorIndexOfIngrediencie = CursorUtil.getColumnIndexOrThrow(_cursor, "ingrediencie");
          final int _cursorIndexOfKategoria = CursorUtil.getColumnIndexOrThrow(_cursor, "kategoria");
          final List<Receptik> _result = new ArrayList<Receptik>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Receptik _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNazov;
            if (_cursor.isNull(_cursorIndexOfNazov)) {
              _tmpNazov = null;
            } else {
              _tmpNazov = _cursor.getString(_cursorIndexOfNazov);
            }
            final String _tmpPopis;
            if (_cursor.isNull(_cursorIndexOfPopis)) {
              _tmpPopis = null;
            } else {
              _tmpPopis = _cursor.getString(_cursorIndexOfPopis);
            }
            final String _tmpPostup;
            if (_cursor.isNull(_cursorIndexOfPostup)) {
              _tmpPostup = null;
            } else {
              _tmpPostup = _cursor.getString(_cursorIndexOfPostup);
            }
            final String _tmpIngrediencie;
            if (_cursor.isNull(_cursorIndexOfIngrediencie)) {
              _tmpIngrediencie = null;
            } else {
              _tmpIngrediencie = _cursor.getString(_cursorIndexOfIngrediencie);
            }
            final String _tmpKategoria;
            if (_cursor.isNull(_cursorIndexOfKategoria)) {
              _tmpKategoria = null;
            } else {
              _tmpKategoria = _cursor.getString(_cursorIndexOfKategoria);
            }
            _item = new Receptik(_tmpId,_tmpNazov,_tmpPopis,_tmpPostup,_tmpIngrediencie,_tmpKategoria);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

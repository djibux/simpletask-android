package nl.mpcjanssen.simpletask.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import nl.mpcjanssen.simpletask.dao.TodoStatus;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TODO_STATUS".
*/
public class TodoStatusDao extends AbstractDao<TodoStatus, String> {

    public static final String TABLENAME = "TODO_STATUS";

    /**
     * Properties of entity TodoStatus.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Key = new Property(0, String.class, "key", true, "KEY");
        public final static Property Value = new Property(1, String.class, "value", false, "VALUE");
    };


    public TodoStatusDao(DaoConfig config) {
        super(config);
    }
    
    public TodoStatusDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TODO_STATUS\" (" + //
                "\"KEY\" TEXT PRIMARY KEY NOT NULL ," + // 0: key
                "\"VALUE\" TEXT);"); // 1: value
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TODO_STATUS\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TodoStatus entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getKey());
 
        String value = entity.getValue();
        if (value != null) {
            stmt.bindString(2, value);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TodoStatus readEntity(Cursor cursor, int offset) {
        TodoStatus entity = new TodoStatus( //
            cursor.getString(offset + 0), // key
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // value
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TodoStatus entity, int offset) {
        entity.setKey(cursor.getString(offset + 0));
        entity.setValue(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(TodoStatus entity, long rowId) {
        return entity.getKey();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(TodoStatus entity) {
        if(entity != null) {
            return entity.getKey();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}

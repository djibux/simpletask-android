package nl.mpcjanssen.simpletask.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import nl.mpcjanssen.simpletask.dao.TodoTags;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TODO_TAGS".
*/
public class TodoTagsDao extends AbstractDao<TodoTags, String> {

    public static final String TABLENAME = "TODO_TAGS";

    /**
     * Properties of entity TodoTags.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Tag = new Property(0, String.class, "tag", true, "TAG");
    };


    public TodoTagsDao(DaoConfig config) {
        super(config);
    }
    
    public TodoTagsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TODO_TAGS\" (" + //
                "\"TAG\" TEXT PRIMARY KEY NOT NULL );"); // 0: tag
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TODO_TAGS\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TodoTags entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getTag());
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TodoTags readEntity(Cursor cursor, int offset) {
        TodoTags entity = new TodoTags( //
            cursor.getString(offset + 0) // tag
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TodoTags entity, int offset) {
        entity.setTag(cursor.getString(offset + 0));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(TodoTags entity, long rowId) {
        return entity.getTag();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(TodoTags entity) {
        if(entity != null) {
            return entity.getTag();
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

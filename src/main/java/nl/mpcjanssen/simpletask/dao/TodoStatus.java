package nl.mpcjanssen.simpletask.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "TODO_STATUS".
 */
public class TodoStatus {

    /** Not-null value. */
    private String key;
    private String value;

    public TodoStatus() {
    }

    public TodoStatus(String key) {
        this.key = key;
    }

    public TodoStatus(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /** Not-null value. */
    public String getKey() {
        return key;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

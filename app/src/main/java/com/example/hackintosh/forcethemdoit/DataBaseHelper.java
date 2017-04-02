package com.example.hackintosh.forcethemdoit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by hackintosh on 4/2/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SmsSender.db";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static class ReceiverModel implements BaseColumns {
        public static final String TABLE_NAME = "receivers";
        public static final String NUMBER = "number";
        public static final String MESSAGE = "message";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNewReceiversTable(SQLiteDatabase db) {
       String table = "CREATE TABLE " + ReceiverModel.TABLE_NAME + " (" +
               ReceiverModel._ID + " INTEGER PRIMARY KEY," +
               ReceiverModel.NUMBER + " TEXT," +
               ReceiverModel.MESSAGE + " TEXT)";

        db.execSQL(table);
    }
}

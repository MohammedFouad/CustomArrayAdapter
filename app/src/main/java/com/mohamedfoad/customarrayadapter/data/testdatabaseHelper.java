package com.mohamedfoad.customarrayadapter.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC-SMART on 12/13/2017.
 */

public class testdatabaseHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = testdatabaseHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "usersdata.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link testdatabaseHelper}.
     *
     * @param context of the app
     */


    public testdatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + testcontract.UserEntry.TABLE_NAME + " ("
                + testcontract.UserEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +testcontract.UserEntry.COLUMN_USER_NAME + " TEXT NOT NULL, "
                + testcontract.UserEntry.COLUMN_USER_HOMETOWN + " TEXT );";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

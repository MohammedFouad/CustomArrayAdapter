package com.mohamedfoad.customarrayadapter.data;

import android.provider.BaseColumns;

/**
 * Created by PC-SMART on 12/13/2017.
 */

public final class testcontract {


    private testcontract(){

    }


    public static final class UserEntry implements BaseColumns {

        /**
         * Name of database table for pets
         */
        public final static String TABLE_NAME = "users";

        /**
         * Unique ID number for the pet (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_USER_NAME = "name";

        /**
         * Breed of the pet.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_USER_HOMETOWN = "hometown";


    }
    }

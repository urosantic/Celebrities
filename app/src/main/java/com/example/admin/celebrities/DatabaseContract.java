package com.example.admin.celebrities;

import android.provider.BaseColumns;
import android.provider.ContactsContract;

/**
 * Created by Admin on 12/4/2017.
 */

public final class DatabaseContract {
    private DatabaseContract(){}

    public static class CelebrityEntity implements BaseColumns {
        public static final String TABLE_NAME = "Celebrities";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String AGE = "age";
        public static final String GENDER = "gender";
        public static final String IMAGE = "image";
        public static final String FAVORITE = "favorite";
    }
}

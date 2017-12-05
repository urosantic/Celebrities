package com.example.admin.celebrities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 12/4/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int version =1;
    private static final String name ="myDb";

    public static final String CREATE_TABLE_CELEBRITIES ="CREATE TABLE " + DatabaseContract.CelebrityEntity.TABLE_NAME +
            " (" + DatabaseContract.CelebrityEntity._ID + " INT PRIMARY KEY AUTOINCREMENT," +
            DatabaseContract.CelebrityEntity.NAME + " TEXT," +
            DatabaseContract.CelebrityEntity.AGE + " INT," +
            DatabaseContract.CelebrityEntity.GENDER + " TEXT," +
            DatabaseContract.CelebrityEntity.IMAGE + " BLOB," +
            DatabaseContract.CelebrityEntity.FAVORITE + " INT);";

    public DatabaseHelper(Context context)  {
        super(context,name,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CELEBRITIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertCelebrity() {}
}

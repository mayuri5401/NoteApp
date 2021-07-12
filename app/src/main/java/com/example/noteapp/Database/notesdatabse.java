package com.example.noteapp.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.noteapp.Model.Notes;
import com.example.noteapp.Dao.NotesDao;

@Database(entities = {Notes.class}, version = 1,exportSchema = false)

public abstract class notesdatabse extends RoomDatabase {


    public abstract NotesDao notesDao();

    public static notesdatabse INSTANCE;

    public static notesdatabse getDatabaseInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    notesdatabse.class,
                    "notes_database").allowMainThreadQueries().build();


        }
        return INSTANCE;
    }


}

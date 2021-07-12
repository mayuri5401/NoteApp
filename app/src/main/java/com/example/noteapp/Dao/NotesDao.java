package com.example.noteapp.Dao;
import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.noteapp.Model.Notes;

import  java.util.List;


@androidx.room.Dao
public abstract class NotesDao {

    @Query("SELECT*FROM notes_database")
    public static LiveData<List<Notes>> getallnotes() {
        return null;
    }

    @Insert
    public static void insertNotes(Notes... notes) {

    }


    @Query("DELETE FROM notes_database WHERE id=id")
   public static void deleteNotes(int id) {

    }


    @Update
    public static void Updatenotes(Notes notes) {
        
    }


}

package com.example.noteapp.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.noteapp.Dao.NotesDao;
import com.example.noteapp.Database.notesdatabse;
import com.example.noteapp.Model.Notes;

import java.util.List;

public class Notes_repository {
    public NotesDao notesDao;


   public LiveData<List<Notes>> getallNotes;

    public  Notes_repository(Application application) {
        notesdatabse database = notesdatabse.getDatabaseInstance(application);
        notesDao=database.notesDao();
        getallNotes = NotesDao.getallnotes();

    }
    public void  insertNotes(Notes notes){
        NotesDao.insertNotes(notes);
    }
    public void  deleteNotes(int id){
        NotesDao.deleteNotes(id);
    }
    public void  Updatenotes(Notes notes){
        NotesDao.Updatenotes(notes);
    }

}

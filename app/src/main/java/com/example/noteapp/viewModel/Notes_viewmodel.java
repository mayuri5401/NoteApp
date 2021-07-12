package com.example.noteapp.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.noteapp.Model.Notes;
import com.example.noteapp.Repository.Notes_repository;

import java.util.List;


public class Notes_viewmodel extends AndroidViewModel {
    public  Notes_repository repository;
    public LiveData<List<Notes>> getallnotes;

    public Notes_viewmodel(@NonNull Application application) {
        super(application);

         repository=new Notes_repository(application);
         getallnotes=repository.getallNotes;


    }
    public void insertnote(Notes note){
        repository.insertNotes(note);

    }
    public void  deletenote(int id){
        repository.deleteNotes(id);
    }
    public void upadtenote(Notes note){
        repository.Updatenotes(note);
    }
}

package com.example.noteapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.noteapp.R;
import com.example.noteapp.notes_adapter;
import com.example.noteapp.viewModel.Notes_viewmodel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    Notes_viewmodel notes_viewmodel;
    RecyclerView noterecycler;
    notes_adapter adapter;

    public Notes_viewmodel getNotes_viewmodel() {
        return notes_viewmodel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = findViewById(R.id.newnotesbtn);
        noterecycler=findViewById(R.id.notesrecyclerview);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertNote.class));
            }
        });
        notes_viewmodel.getallnotes.observe(this, notes -> {
            noterecycler.setLayoutManager(new GridLayoutManager(this,2));
            adapter=new notes_adapter(MainActivity.this,notes);
            noterecycler.setAdapter(adapter);


    });


    }
}
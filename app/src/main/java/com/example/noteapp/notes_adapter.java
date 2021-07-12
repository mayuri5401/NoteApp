package com.example.noteapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteapp.Activity.MainActivity;
import com.example.noteapp.Model.Notes;

import java.util.List;

public class notes_adapter extends RecyclerView.Adapter<notes_adapter.notesviewholder> {
    MainActivity mainActivity;
    List<Notes> notes;
    public notes_adapter(MainActivity mainActivity, List<Notes> notes) {
        this.mainActivity=mainActivity;
        this.notes=notes;

    }

    @NonNull
    @Override
    public notesviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new notesviewholder(LayoutInflater.from(mainActivity).inflate(R.layout.item_notes,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull  notes_adapter.notesviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class notesviewholder extends  RecyclerView.ViewHolder {
        public notesviewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

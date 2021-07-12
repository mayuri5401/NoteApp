package com.example.noteapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Toast;

import com.example.noteapp.Model.Notes;
import com.example.noteapp.R;
import com.example.noteapp.databinding.ActivityInsertNoteBinding;
import com.example.noteapp.viewModel.Notes_viewmodel;

import java.util.Date;

import static com.example.noteapp.R.drawable.ic_baseline_done_24;

public class InsertNote extends AppCompatActivity {

    ActivityInsertNoteBinding binding;
    String title,subtitle,notes;
    Notes_viewmodel notes_viewmodel;
    String prority="1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityInsertNoteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        notes_viewmodel= ViewModelProviders.of(this).get(Notes_viewmodel.class);

        binding.green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.green.setImageResource(ic_baseline_done_24);
                binding.yelllow.setImageResource(0);
                binding.red.setImageResource(0);
                prority="1";


            }
        });
        binding.yelllow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.yelllow.setImageResource(ic_baseline_done_24);
                binding.green.setImageResource(0);
                binding.red.setImageResource(0);
                prority="2";


            }
        });
        binding.red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.red.setImageResource(ic_baseline_done_24);
                binding.yelllow.setImageResource(0);
                binding.green.setImageResource(0);
                prority="3";

            }
        });



        binding.donenotesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title=binding.title.getText().toString();
                subtitle=binding.subtitle.getText().toString();
                notes=binding.notesdata.getText().toString();

                CreateNotes(title,subtitle,notes);

            }
        });
    }

    private void CreateNotes(String title, String subtitle, String notes) {
        Notes notes1=new Notes();

        Date date=new Date();
        CharSequence sequence= DateFormat.format("MMMM d,YYYY",date.getTime());
        notes1.notes_title=title;
        notes1.notes_sub_title=subtitle;
        notes1.notes=notes;
        notes1.ntes_priority=prority;
        notes1.notes_date= (String) sequence.toString();
        notes_viewmodel.insertnote(notes1);
        Toast.makeText(this, "notes created successfully", Toast.LENGTH_SHORT).show();
        finish();

    }
}
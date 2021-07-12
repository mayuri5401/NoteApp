package com.example.noteapp.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes_database")

public class Notes {
    @PrimaryKey(autoGenerate = true)
    public  int id;

    @ColumnInfo(name = "notes_title")
    public String notes_title;

    @ColumnInfo(name = "notes_sub_title")
    public String notes_sub_title;

    @ColumnInfo(name = "notes_date")
    public String notes_date;

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name = "notes_priority")
    public String ntes_priority;

}

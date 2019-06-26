package com.example.android.notepad.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.android.notepad.data.model.Note;

@Dao
public interface NoteDao {

    @Insert
    void insertNoteToDb(Note note);

    @Update
    void updateUser(Note note);

    @Query("SELECT * from note")
    Note getNote();

    @Query("SELECT title from note")
    String getNoteTitleFromDatabase();

    @Query("SELECT text from note")
    String getNoteTExtFromDatabase();

}



package com.example.android.notepad.data.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "note")
public class Note {


    @ColumnInfo(name = "title")
    private String Title;

    @ColumnInfo(name = "text")
    private String Text;

    @PrimaryKey(autoGenerate = true)
    private int nid;


    public Note() {
    }

    public Note(String text, String title) {
        this.Text = text;
        this.Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
}

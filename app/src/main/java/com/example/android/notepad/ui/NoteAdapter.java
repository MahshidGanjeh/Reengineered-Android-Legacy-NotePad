package com.example.android.notepad.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.notepad.R;
import com.example.android.notepad.data.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<myViewHolder> {


    List<Note> mNotesList = new ArrayList();
    LayoutInflater inflater;

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new myViewHolder(inflater.inflate(R.layout.noteslist_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder viewHolder, int i) {
        viewHolder.onBind(mNotesList.get(i));
    }

    @Override
    public int getItemCount() {
        return mNotesList.size();
    }

    public void setmNotesList(List mNotesList) {
        this.mNotesList = mNotesList;
    }
}

class myViewHolder extends RecyclerView.ViewHolder {

    TextView text;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text_tv);
    }

    void onBind(Note note) {
        text.setText(note.getText());
    }
}

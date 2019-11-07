package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?","Siapa Nama Mu ?"));
        words.add(new Word("My name is Raihan ","Nama Saya Raihan."));
        words.add(new Word("How are you feeling?","Bagaimana Perasaanya ?"));
        words.add(new Word("Come here.","Kesini"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Satu", R.drawable.number_one));
        words.add(new Word("Two","Dua", R.drawable.number_two));
        words.add(new Word("Three","Tiga", R.drawable.number_three));
        words.add(new Word("Four","Empat", R.drawable.number_four));
        words.add(new Word("Five","Lima", R.drawable.number_five));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","Merah", R.drawable.color_red));
        words.add(new Word("Green","Hijau", R.drawable.color_green));
        words.add(new Word("Brown","Coklat", R.drawable.color_brown));
        words.add(new Word("Gray","Abu-Abu", R.drawable.color_gray));
        words.add(new Word("Black","Hitam", R.drawable.color_black));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

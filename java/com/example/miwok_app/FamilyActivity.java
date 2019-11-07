package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","Ayah", R.drawable.family_father));
        words.add(new Word("Mother","Ibu", R.drawable.family_mother));
        words.add(new Word("Son","Anak Laki-Laki", R.drawable.family_son));
        words.add(new Word("Daughter","Anak Perempuan", R.drawable.family_daughter));
        words.add(new Word("Grandmother","Nenek", R.drawable.family_grandmother));
        words.add(new Word("Grandfather","Kakek", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

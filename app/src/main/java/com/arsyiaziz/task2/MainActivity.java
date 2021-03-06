package com.arsyiaziz.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toBiodataActivity(View view) {
        Intent switchActivityIntent = new Intent(this, BiodataActivity.class);
        startActivity(switchActivityIntent);
    }

    public void toArticleActivity(View view) {
        Intent switchActivityIntent = new Intent(this, ArticleActivity.class);
        startActivity(switchActivityIntent);
    }
}
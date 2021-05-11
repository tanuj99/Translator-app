package com.example.tanslator_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });


    }
    public void openFamilyPage(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);

    }
    public void openColorsPage(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);

    }
    public void openPhrasesPage(View view) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);

    }



}
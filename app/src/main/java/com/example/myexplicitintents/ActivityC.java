package com.example.myexplicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String aString = extras.getString("aString");
        final TextView textViewAnswer = findViewById(R.id.textViewAnswer);
        textViewAnswer.setText(aString);

        String qString = extras.getString("qString");
        final TextView textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewQuestion.setText(qString);


    }
}
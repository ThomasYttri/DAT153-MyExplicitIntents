package com.example.myexplicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");

        final TextView textView = findViewById(R.id.textView2);
        textView.setText(qString);
    }

    public void answerQuestion(View view){
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String qString = extras.getString("qString");

        Intent i = new Intent(this, ActivityC.class);

        final EditText editText2 = findViewById(R.id.editText2);
        String myString = editText2.getText().toString();
        i.putExtra("aString", myString);
        i.putExtra("qString", qString);

        startActivity(i);
    }
}
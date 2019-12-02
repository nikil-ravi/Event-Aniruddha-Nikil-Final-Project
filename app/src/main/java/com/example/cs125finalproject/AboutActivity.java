package com.example.cs125finalproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public final class AboutActivity extends AppCompatActivity {
    private String text;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        TextView aboutText = findViewById(R.id.textView);
        text = "This is an events app";
        aboutText.setText(text);
    }
}

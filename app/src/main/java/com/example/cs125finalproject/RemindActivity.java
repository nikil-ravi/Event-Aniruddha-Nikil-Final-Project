package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class RemindActivity extends AppCompatActivity {
    private static final String TAG = "ReminderActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind);
        Log.i(TAG, "Reminder activity has been triggered");

    }
}

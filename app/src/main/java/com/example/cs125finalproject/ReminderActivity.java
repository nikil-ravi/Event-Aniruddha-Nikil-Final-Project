package com.example.cs125finalproject;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public final class ReminderActivity extends AppCompatActivity {
    private static final String TAG = "ReminderActivity";
    protected void onCreate(Bundle savedinstancestate) {
        super.onCreate(savedinstancestate);
        Log.i(TAG, "Reminder activity has been triggered");
    }
}

package com.example.cs125finalproject;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public final class DisplayMapActivity extends AppCompatActivity {
    private static final String TAG = "DisplayMapActivity";
    protected void onCreate(Bundle savedinstancestate) {
        super.onCreate(savedinstancestate);
        Log.i(TAG, "Map activity has been triggered");
    }
}

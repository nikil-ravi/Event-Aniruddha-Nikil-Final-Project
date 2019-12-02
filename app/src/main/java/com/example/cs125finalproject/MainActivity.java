package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For all below code, should we finish or not??

        Button eventsmap = findViewById(R.id.mapButton);
        //context must be checked
        eventsmap.setOnClickListener(unused -> {
            startActivity(new Intent(this, DisplayMapActivity.class));
            //finish or not?
        });

        Button reminder = findViewById(R.id.reminderCalendar);
        //context must be checked
        reminder.setOnClickListener(unused -> {
            startActivity(new Intent(this, ReminderActivity.class));
        });

        Button about = findViewById(R.id.aboutUs);
        //context must be checked
        about.setOnClickListener(unused -> {
            startActivity(new Intent(this, AboutUsActivity.class));
        });

        Button contact = findViewById(R.id.contact);
        //context must be checked
        contact.setOnClickListener(unused -> {
            startActivity(new Intent(this, ContactUsActivity.class));
        });
    }
}

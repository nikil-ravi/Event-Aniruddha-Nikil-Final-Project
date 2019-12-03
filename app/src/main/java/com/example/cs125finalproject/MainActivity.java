package com.example.cs125finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For all below code, should we finish or not??
        TextView title = findViewById(R.id.title);
        title.setTextColor(Color.WHITE);
        title.setBackgroundColor(Color.CYAN);


        Button eventsmap = findViewById(R.id.mapButton);
        //context must be checked
        eventsmap.setOnClickListener(unused -> {
            startActivity(new Intent(this, DisplayActivity.class));
            //finish or not?
        });

        Button reminder = findViewById(R.id.reminderCalendar);
        //context must be checked
        reminder.setOnClickListener(unused -> {
            startActivity(new Intent(this, RemindActivity.class));
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

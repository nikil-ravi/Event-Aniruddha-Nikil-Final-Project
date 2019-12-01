package com.example.cs125finalproject;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public final class ContactActivity extends AppCompatActivity {
    private String phone;
    private String email;
    private String address;

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        EditText phoneText = findViewById(R.id.phoneNumber);
        EditText emailText = findViewById(R.id.eMail);
        EditText addressText = findViewById(R.id.address);
        phone = "(217) 111-3333";
        email = "eventsApp@event.com";
        address = "Event City";
        phoneText.setText(phone);
        emailText.setText(email);
        addressText.setText(address);
    }
}

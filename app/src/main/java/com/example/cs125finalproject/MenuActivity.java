package com.example.cs125finalproject;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

//import android.provider.ContactsContract;



public final class MenuActivity extends AppCompatActivity {

    //may need to have an oncreate function

    /**
     * Sets up the Menu user interface
     */

    public void setupmenuUI() {
        /**
         * Create chunks
         * Call the API functions and populate the chunks with info
         * Include a setonclicklistener for each option in the menu
         * Create the handlers for each button in the menu
         * if the user does something stupid, display error message (this may not be necessary)
         */

    }

    public void enterMap() {
        //Check the context (for now I have made it 'this'
        Intent intent = new Intent(this, DisplayActivity.class);
        startActivity(intent);
        //Do we have to finish?
    }

}

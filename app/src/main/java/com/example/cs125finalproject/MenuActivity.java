package com.example.cs125finalproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



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
        Intent intent = new Intent(this, DisplayMapActivity.class);
        startActivity(intent);
        //Do we have to finish?
    }

}

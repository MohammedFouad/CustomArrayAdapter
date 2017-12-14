package com.mohamedfoad.customarrayadapter;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.mohamedfoad.customarrayadapter.data.testcontract;
import com.mohamedfoad.customarrayadapter.data.testdatabaseHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String nameString;
    String homeTownString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> arrayOfUsers = new ArrayList<>();

        UserAdapter adapter = new UserAdapter(this,arrayOfUsers);

        User newUser = new User("Nathan", "SanDiego");
        User newUser1 = new User("Mohamed", "SanDiego");
        User newUser2 = new User("Islam", "SanDiego");
        User newUser3 = new User("me", "SanDiego");
        User newUser4 = new User("hadia", "SanDiego");

        adapter.add(newUser);
        adapter.add(newUser1);
        adapter.add(newUser2);
        adapter.add(newUser3);
        adapter.add(newUser4);

        ListView listView = (ListView)findViewById(R.id.lvItems);
        listView.setAdapter(adapter);
    }

    public void insertUser(){

        // Create database helper
        testdatabaseHelper mDbHelper = new testdatabaseHelper(this);

        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();


        ContentValues values = new ContentValues();
        values.put(testcontract.UserEntry.COLUMN_USER_NAME, nameString);
        values.put(testcontract.UserEntry.COLUMN_USER_HOMETOWN, homeTownString);

        // Insert a new row for pet in the database, returning the ID of that new row.
        long newRowId = db.insert(testcontract.UserEntry.TABLE_NAME, null, values);

        // Show a toast message depending on whether or not the insertion was successful
        if (newRowId == -1) {
            // If the row ID is -1, then there was an error with insertion.
            Toast.makeText(this, "Error with saving pet", Toast.LENGTH_SHORT).show();
        } else {
            // Otherwise, the insertion was successful and we can display a toast with the row ID.
            Toast.makeText(this, "Pet saved with row id: " + newRowId, Toast.LENGTH_SHORT).show();
        }



    }


}

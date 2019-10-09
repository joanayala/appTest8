package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pets.classes.connectionDB;

public class MainActivity extends AppCompatActivity {

    EditText Fname, Lname, Email, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fname = findViewById(R.id.idFname);
        Lname = findViewById(R.id.idLname);
        Email = findViewById(R.id.idEmail);
        Password = findViewById(R.id.idPassword);
    }

    public void Register(View view){
        connectionDB manager = new connectionDB(this,
                "pets", null, 1);
        SQLiteDatabase pets = manager.getWritableDatabase();

        String FNAME  = Fname.getText().toString();
        String LNAME  = Lname.getText().toString();
        String EMAIL  = Email.getText().toString();
        String PASSWD = Password.getText().toString();

        if(!FNAME.isEmpty() && !LNAME.isEmpty() && !EMAIL.isEmpty() && !PASSWD.isEmpty()) {

            //Validation: Don't repeat E-mail
            Cursor row = pets.rawQuery(
                    "SELECT * FROM users WHERE email = '" + EMAIL + "'LIMIT 1", null
            );

            //if(row.getCount() > 0){
            if(row.moveToFirst()){
                Toast.makeText(this, "Email already exists.", Toast.LENGTH_SHORT).show();
                pets.close();
            }else{
                ContentValues DATA = new ContentValues();
                DATA.put("firstname", FNAME);
                DATA.put("lastname", LNAME);
                DATA.put("email", EMAIL);
                DATA.put("password", PASSWD);

                pets.insert("users", null, DATA);
                Toast.makeText(this, "The user has been created !!!",
                        Toast.LENGTH_SHORT).show();
                pets.close();
            }
        }else{
            Fname.setText("Field can't be empty");
            Lname.setText("Field can't be empty");
            Email.setText("Field can't be empty");
            Password.setText("Field can't be empty");
            Toast.makeText(this, "There are empty fields", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.firstapplication8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    private EditText a, b, c, d, e;
    private TextView f, g, h, i, j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        a = findViewById(R.id.IdFname);
        b = findViewById(R.id.IdLname);
        c = findViewById(R.id.IdMobile);
        d = findViewById(R.id.IdEmail);
        e = findViewById(R.id.IdPasswd);

        f = findViewById(R.id.IdLnameTxt);
        g = findViewById(R.id.IdLnameTxt);
        h = findViewById(R.id.IdLnameTxt);
        i = findViewById(R.id.IdLnameTxt);
        j = findViewById(R.id.IdLnameTxt);
    }

    public void validate(View view){

        String Fname = a.getText().toString();
        f.setText(Fname);
        String Lname = b.getText().toString();
        g.setText(Lname);
        String Mobile = c.getText().toString();
        h.setText(Mobile);
        String Email = d.getText().toString();
        i.setText(Email);
        String Passwd = e.getText().toString();
        j.setText(Passwd);



    }
}

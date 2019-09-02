package com.example.firstapplication8a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void SignIn(View view){
        //Redirect depends of login Activity

        String email1 = "peter@gmail.com";
        String passwd1 = "123abc";

        String email2 = "juan@gmail.com";
        String passwd2 = "123abcd";

        //***************************************
        //Recibir valores de las cajas de texto
        //***************************************

        if(passwd1 == passwd2 && email1 == email2){
            Toast.makeText(this, "Invalid login.", Toast.LENGTH_LONG).show();
        }else{
            //Redirect to menuActivity
        }
    }

    public void SignUp(View view){
        //Redirect to SignUp Activity
    }
}

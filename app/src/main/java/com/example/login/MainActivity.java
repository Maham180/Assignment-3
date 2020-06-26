package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button login;
    private Button sign_up;
    boolean isEmailValid;
    boolean isPasswordValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Contact App");

        Email=(EditText) findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.button);
        sign_up=(Button)findViewById(R.id.button2);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();




            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this, Sign_Up.class);
                startActivity(in1);
            }
        });

    }
    public void SetValidation() {

        if (Email.getText().toString().isEmpty()) {
            Email.setError(getResources().getString(R.string.email_error));
            isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches()) {
            Email.setError(getResources().getString(R.string.error_invalid_email));
            isEmailValid = false;
        } else  {
            isEmailValid = true;
        }

        if (Password.getText().toString().isEmpty()) {
            Password.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else if (Password.getText().length() < 6) {
            Password.setError(getResources().getString(R.string.error_invalid_password));
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
        }

        if (isEmailValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
            Intent in1=new Intent(MainActivity.this, Contact1.class);
            startActivity(in1);
        }
    }

}

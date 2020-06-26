package com.example.login;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class Sign_Up extends AppCompatActivity {

    private EditText Name;
    private EditText Email;
    private EditText Password;
    private Button Signup;
    private Button sign_in;


    boolean isEmailValid;
    boolean isPasswordValid;
    boolean isNameValid;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        Name=(EditText) findViewById(R.id.name);
        Email=(EditText) findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.pass);
        Signup=(Button)findViewById(R.id.button);
        sign_in=(Button)findViewById(R.id.button2);




        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
            }
        });

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(Sign_Up.this, MainActivity.class);
                startActivity(in2);
            }
        });

    }

    public void SetValidation() {

        if (Name.getText().toString().isEmpty()) {
            Name.setError(getResources().getString(R.string.name_error));
            isNameValid = false;
        } else  {
            isNameValid = true;
        }
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

        if (isNameValid && isEmailValid  && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully Sign up", Toast.LENGTH_SHORT).show();
            Intent in3=new Intent(Sign_Up.this, Contact1.class);
            startActivity(in3);
        }
    }
}
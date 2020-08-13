package com.example.todonotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText editTextFullName, editTextUsername;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextFullName=findViewById(R.id.editTextFullName);
        editTextUsername=findViewById(R.id.editTextUsername);
        buttonLogin=findViewById(R.id.buttonLogin);
        View.OnClickListener clickAction =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName=editTextFullName.getText().toString();
                String userName=editTextUsername.getText().toString();
                if(!TextUtils.isEmpty(fullName) && !TextUtils.isEmpty(userName)) {
                    Intent intent = new Intent(LoginActivity.this, MyNotesActivity.class);
                    intent.putExtra("full_name", fullName);
                    intent.putExtra("username", userName);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this,"Username And Full Name can't be empty!!",Toast.LENGTH_SHORT).show();
                }
            }
        };
        buttonLogin.setOnClickListener(clickAction);
    }
}
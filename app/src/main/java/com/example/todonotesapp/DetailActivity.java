package com.example.todonotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.todonotesapp.AppConstant.DESCRIPTION;
import static com.example.todonotesapp.AppConstant.TITLE;

public class DetailActivity extends AppCompatActivity {
    TextView textViewTitle, getTextViewDescription;
    String TAG="DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bindViews();
        setupIntentData();
    }

    private void setupIntentData() {
        Intent intent=getIntent();
        Log.d(TAG, intent.getStringExtra(TITLE));
        String title=intent.getStringExtra(TITLE);
        String description=intent.getStringExtra(DESCRIPTION);
        textViewTitle.setText(title);
        getTextViewDescription.setText(description);
    }

    private void bindViews() {
        textViewTitle=findViewById(R.id.textViewTitle);
        getTextViewDescription=findViewById((R.id.textViewDescription));
    }
}
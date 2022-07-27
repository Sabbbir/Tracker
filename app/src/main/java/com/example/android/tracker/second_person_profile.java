package com.example.android.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class second_person_profile extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_person_profile);
    button = findViewById(R.id.button4);
    button.setOnClickListener(view -> back());
    }

    public void back() {
        Intent intent = new Intent(this,login_home.class);
        startActivity(intent);
    }
}
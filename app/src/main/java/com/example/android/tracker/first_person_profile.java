package com.example.android.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class first_person_profile extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_person_profile);

        back = findViewById(R.id.button4);
        back.setOnClickListener(view -> backto_login_main());
    }

    public void backto_login_main() {
        Intent intent = new Intent(this,login_home.class);
        startActivity(intent);
    }

}
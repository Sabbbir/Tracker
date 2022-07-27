package com.example.android.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login_main;
    Button signup_main;
    Button skip_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup_main = findViewById(R.id.signup_main);
//        signup_main.setOnClickListener(view -> signup_as_Landlord());

        login_main = findViewById(R.id.login_main);
        login_main.setOnClickListener(view -> login_main());

        skip_main = findViewById(R.id.skip_main);
        skip_main.setOnClickListener(view -> skip_main());

    }
    public void login_main(){
        Intent intent = new Intent(this, login_main.class);
        startActivity(intent);
    }
    public void skip_main(){
        Intent intent = new Intent(this, activity_skip_signup_login.class);
        startActivity(intent);
    }
    public void signup_as_Landlord(){
        Intent intent = new Intent(this, activity_signup_landlord.class);
        startActivity(intent);
    }
}
package com.example.android.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_home extends AppCompatActivity {
    Button info_person_one,info_person_two,add_renter_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home);

        info_person_one = findViewById(R.id.button);
        info_person_one.setOnClickListener(view ->  first_person_profile());

        info_person_two = findViewById(R.id.button3);
        info_person_two.setOnClickListener(view -> second_person_profile());

        add_renter_info = findViewById(R.id.login_add);
        add_renter_info.setOnClickListener(view -> renter_add_info());

    }
    public void first_person_profile(){

        Intent intent = new Intent(this, first_person_profile.class);
        startActivity(intent);
    }
    public void second_person_profile(){
        Intent intent = new Intent(this, second_person_profile.class);
        startActivity(intent);
    }
    public void  renter_add_info(){
        Intent intent = new Intent(this,activity_add_renter_info.class);
        startActivity(intent);
    }


}
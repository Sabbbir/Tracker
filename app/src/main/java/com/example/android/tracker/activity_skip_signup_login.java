package com.example.android.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class activity_skip_signup_login extends AppCompatActivity {
    Button add_renter_info,person_one,person_two,dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_signup_login);

        add_renter_info = findViewById(R.id.skip_login_add);
        add_renter_info.setOnClickListener(view -> renderer_info_page());

        person_one = findViewById(R.id.button);
        person_one.setOnClickListener(view -> first_person_profile());

        person_two = findViewById(R.id.button3);
        person_two.setOnClickListener(view -> second_person_profile());
    }
    public void renderer_info_page(){
        Intent intent = new Intent(this,add_renterer_info_cont.class);
        startActivity(intent);
    }
    public void first_person_profile(){
        Intent intent = new Intent(this, first_p_profile_without_logging_in.class);
        startActivity(intent);
    }
    public void second_person_profile(){
        Intent intent = new Intent(this, second_person_profile_without_logging_in.class);
        startActivity(intent);
    }
}
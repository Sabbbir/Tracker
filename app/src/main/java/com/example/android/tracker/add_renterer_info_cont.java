package com.example.android.tracker;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class add_renterer_info_cont extends AppCompatActivity {
    TextView first_name_obj,last_name_obj,fathers_name_obj,mothers_name_obj,nid_num_obj,fathers_nid_obj,birthdate_obj,age_obj,arrival_date_obj,department_obj,session_obj,year_obj;
    Button submit_renter_info_button,cambutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_renterer_info_cont);

        submit_renter_info_button = findViewById(R.id.submit);
        submit_renter_info_button.setOnClickListener(view -> make_var_of_renter());

        cambutton = findViewById(R.id.choose_pic);
        cambutton.setOnClickListener(view -> camera());

        first_name_obj = findViewById(R.id.editTextTextPersonName3);
        last_name_obj = findViewById(R.id.editTextTextPersonName4);
        fathers_name_obj =  findViewById(R.id.editTextTextPersonName5);
        mothers_name_obj =  findViewById(R.id.editTextTextPersonName6);
        nid_num_obj =  findViewById(R.id.editTextTextPersonName7);
        fathers_nid_obj =  findViewById(R.id.editTextTextPersonName10);
        birthdate_obj =  findViewById(R.id.editTextTextPersonName88);
        age_obj  =  findViewById(R.id.editTextTextPersonName11);
        arrival_date_obj =  findViewById(R.id.editTextTextPersonName9);
        department_obj =  findViewById(R.id.editTextTextPersonName12);
        session_obj  =  findViewById(R.id.editTextTextPersonName112);
        year_obj =  findViewById(R.id.editTextTextPersonName1121);

    }

    public void  make_var_of_renter(){
        String full_name,firstname,lastname,fathers_name,mothers_name,nid,fathers_nid,birthdate,age,arrivaldate,department,session,year;
        firstname = first_name_obj.getText().toString().trim();
        lastname = last_name_obj.getText().toString().trim();
        fathers_name=fathers_name_obj.getText().toString().trim();
        mothers_name = mothers_name_obj.getText().toString().trim();
        nid = nid_num_obj.getText().toString().trim();
        fathers_nid = fathers_nid_obj.getText().toString().trim();
        birthdate = birthdate_obj.getText().toString().trim();
        age = age_obj.getText().toString().trim();
        arrivaldate = arrival_date_obj.getText().toString().trim();
        department = department_obj.getText().toString().trim();
        session = session_obj.getText().toString().trim();
        year = year_obj.getText().toString().trim();


        //full name
        full_name = firstname+" "+lastname;
        if(firstname.isEmpty()){
            first_name_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(lastname.isEmpty()){
            last_name_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(fathers_name.isEmpty()){
            fathers_name_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(mothers_name.isEmpty()){
            mothers_name_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(nid.isEmpty()){
           nid_num_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(fathers_nid.isEmpty()){
            fathers_nid_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(birthdate.isEmpty()){
            birthdate_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(age.isEmpty()){
            age_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(arrivaldate.isEmpty()){
            arrival_date_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(department.isEmpty()){
            department_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(session.isEmpty()){
            session_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }
        if(year.isEmpty()){
            year_obj.setError("Field can not be Empty!");
            getCurrentFocus();
        }

            if((!firstname.isEmpty()) && (!lastname.isEmpty()) && (!fathers_name.isEmpty()) && (!mothers_name.isEmpty()) && !(nid.isEmpty()) && !(fathers_nid.isEmpty()) && !(birthdate.isEmpty()) && !(age.isEmpty()) && !(arrivaldate.isEmpty()) && !(department.isEmpty()) && !(session.isEmpty()) && (!year.isEmpty())) {
                Intent intent = new Intent(this, login_home.class);
                startActivity(intent);
            }
    }
    public void camera(){
        try {
            Intent intent = new Intent();
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
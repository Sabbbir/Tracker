package com.example.android.tracker;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;

public class activity_add_renter_info extends AppCompatActivity {
    TextView first_name_obj,last_name_obj,fathers_name_obj,mothers_name_obj,nid_num_obj,fathers_nid_obj,birthdate_obj,age_obj,arrival_date_obj,department_obj;
    Button submit_renter_info_button,cambutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_renter_info);

        submit_renter_info_button = findViewById(R.id.submit_renter_info);
        submit_renter_info_button.setOnClickListener(view -> make_variable_of_renter_info());

        cambutton = findViewById(R.id.button2);
        cambutton.setOnClickListener(view -> camera());

        first_name_obj = findViewById(R.id.editTextTextPersonName3);
        last_name_obj = findViewById(R.id.editTextTextPersonName4);
        fathers_name_obj = findViewById(R.id.editTextTextPersonName5);
        mothers_name_obj= findViewById(R.id.editTextTextPersonName6);
        nid_num_obj= findViewById(R.id.editTextTextPersonName7);
        fathers_nid_obj = findViewById(R.id.editTextTextPersonName10);
        birthdate_obj = findViewById(R.id.editTextTextPersonName8);
        age_obj = findViewById(R.id.editTextTextPersonName11);
        arrival_date_obj = findViewById(R.id.editTextTextPersonName9);
        department_obj = findViewById(R.id.editTextTextPersonName12);
    }
    public void  make_variable_of_renter_info(){

        String full_name,firstname,lastname,fathers_name,mothers_name,nid,fathers_nid,birthdate,age,arrivaldate,department;

                //Storing all the info as variable

        firstname = first_name_obj.getText().toString();
        lastname = last_name_obj.getText().toString();
        fathers_name = fathers_name_obj.getText().toString();
        mothers_name = mothers_name_obj.getText().toString();
        nid = nid_num_obj.getText().toString();
        fathers_nid = fathers_nid_obj.getText().toString();
        birthdate = birthdate_obj.getText().toString();
        age = age_obj.getText().toString();
        arrivaldate = arrival_date_obj.getText().toString();
        department = department_obj.getText().toString();

                //Making the full_name
        full_name = firstname + " " + lastname;
//csv file addition
//        try {
//            String path = "/home/druglord/AndroidStudioProjects/Tracker/app/src/androidTest/java/";
//            File myobj = new File(path+"students_info_csv.txt");
//            if(myobj.createNewFile()){
//                System.out.println("File created successfully "+myobj.getName() + myobj.getAbsolutePath());
//            }
//            else
//            {
//                System.out.println("File exists");
//            }
//        }
//        catch(IOException e){
//            System.out.println("Error!");
//            e.printStackTrace();
//        }

//csv file addition end


                //Going to the next page --> login home page where we came from
//        Toast.makeText(this,"NID: "+nid+" ",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,login_home.class);
        startActivity(intent);
    }
    public void camera() {
        try {
            Intent intent = new Intent();
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
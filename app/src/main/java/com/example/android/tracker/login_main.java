package com.example.android.tracker;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_main extends AppCompatActivity {
    Button login;
    TextView email_obj,password_obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        login = findViewById(R.id.login_login);
        login.setOnClickListener(view -> login_home());

        email_obj = findViewById(R.id.editTextTextPersonName);
        password_obj = findViewById(R.id.editTextTextPersonName2);

    }
    public void login_home(){
        String email,password;
        email = email_obj.getText().toString();
        password = password_obj.getText().toString();

//        if(email.length()==0) {
//            email_obj.setError("Email address can not be empty!!");
//            email_obj.requestFocus();
//            password_obj.setError("Please enter email address first!");
//            password_obj.requestFocus();
//        }
//        if (email.length()>0 && password.length()==0){
//            password_obj.setError("Password cannot be empty!");
//            password_obj.requestFocus();
//        }

        if(email.isEmpty())
        {
            email_obj.setError("Email address can not be empty!!");
            email_obj.requestFocus();
            password_obj.setError("Please enter email address first!");
            password_obj.requestFocus();

//            email_obj.setError("Enter a email address!");
//            email_obj.requestFocus();
            return;

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            email_obj.setError("Enter a valid email address!");
            email_obj.requestFocus();
            return;
        }
        //checking validity of pass
        if(password.isEmpty())
        {
            password_obj.setError("Enter a password!");
            password_obj.requestFocus();
            return;
        }
        if(password.length()<6)
        {
            password_obj.setError("Enter minimum 6 length password!");
            password_obj.requestFocus();
            return;
        }
        if((email.equals("admin@gmail.com") || email.equals("sabbirahmed@gmail.com") || email.equals("joymondal@gmail.com") || email.equals("ahsanmahmud@gmail.com")) && password.equals("password")){
            Intent intent = new Intent(this, login_home.class);
            startActivity(intent);
        }
        else{
            password_obj.setError("Mail or password didn't match");
            password_obj.requestFocus();
        }
    }
}

//    private void userRegister() {
//        String email=sign_up_mail.getText().toString().trim();
//        String password=sign_up_pass.getText().toString().trim();
//        //checking validity of mail
//        if(email.isEmpty())
//        {
//            sign_up_mail.setError("Enter a email address!");
//            sign_up_mail.requestFocus();
//            return;
//
//        }
//        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
//        {
//            sign_up_mail.setError("Enter a valid email address!");
//            sign_up_mail.requestFocus();
//            return;
//        }
//        //checking validity of pass
//        if(password.isEmpty())
//        {
//            sign_up_pass.setError("Enter a password!");
//            sign_up_pass.requestFocus();
//
//
//        }
//        if(password.length()<6)
//        {
//            sign_up_pass.setError("Enter minimum 6 length password!");
//            sign_up_pass.requestFocus();
//        }
//        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(),"Register is successful",Toast.LENGTH_SHORT).show();
//
//                } else {
//                    Toast.makeText(getApplicationContext(),"Register is not successful",Toast.LENGTH_SHORT).show();
//
//
//                }
//
//            }
//        });
//    }
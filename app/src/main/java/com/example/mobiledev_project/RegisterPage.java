package com.example.mobiledev_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {

    EditText eRFname, eRLname, eRAddress, eREmailAdd, eRPassword;
    CheckBox cbAlumni;
    Button btn1, btn2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn1 = (Button) findViewById(R.id.btn_rSignup);
        btn2 = (Button) findViewById(R.id.btn_rSignin);
        eRFname = (EditText) findViewById(R.id.eRFname);
        eRLname = (EditText) findViewById(R.id.eRLname);
        eRAddress = (EditText) findViewById(R.id.eRAddress);
        eREmailAdd = (EditText) findViewById(R.id.eREmailAdd);
        eRPassword = (EditText) findViewById(R.id.eRPassword);
        cbAlumni = (CheckBox) findViewById(R.id.cbRAlumni);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = eRFname.getText().toString();
                String lname = eRLname.getText().toString();
                String address = eRAddress.getText().toString();
                String email = eREmailAdd.getText().toString();
                String password = eRPassword.getText().toString();
                Boolean isAlumni = cbAlumni.isChecked();
                Intent intent = new Intent(RegisterPage.this, LogInPage.class);
                intent.putExtra("fname_key", fname);
                intent.putExtra("lname_key", lname);
                intent.putExtra("address_key", address);
                intent.putExtra("email_key", email);
                intent.putExtra("password_key", password);
                intent.putExtra("isAlumni_key", isAlumni);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RegisterPage.this, LogInPage.class);
                startActivity(intent1);
            }
        });
    }

}
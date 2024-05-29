package com.example.mobiledev_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ImmediateNeedForm extends AppCompatActivity {
    ImageView btnMenu;
    ImageView btnProfile;
    Button btnSubmit;

    // info sa namatay
    EditText dead_lname;
    EditText dead_mname;
    EditText dead_fname;
    EditText dead_birthdate;
    EditText dead_deathdate;
    EditText dead_deathtime;

    // info sa doctor
    EditText doctor_fullname;
    EditText doctor_emailadd;
    EditText doctor_birthdate;


    //info sa guardian
    EditText guard_lname;
    EditText guard_mname;
    EditText guard_fname;
    EditText guard_relationship;
    EditText guard_address;
    EditText guard_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immediate_need_form);
        btnSubmit = (Button) findViewById(R.id.btnFormSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ImmediateNeedForm.this, CoffinProduct.class));
            }
        });

        btnMenu = (ImageView) findViewById(R.id.menu_bar);
        btnProfile = (ImageView) findViewById(R.id.user_profile);

        dead_lname = (EditText) findViewById(R.id.dead_lname);
        dead_mname = (EditText) findViewById(R.id.dead_mname);
        dead_fname = (EditText) findViewById(R.id.dead_fname);
        dead_birthdate = (EditText) findViewById(R.id.dead_birthdate);
        dead_deathdate = (EditText) findViewById(R.id.dead_deathdate);
        dead_deathtime = (EditText) findViewById(R.id.dead_deathtime);

        doctor_fullname = (EditText) findViewById(R.id.doctor_fullname);
        doctor_emailadd = (EditText) findViewById(R.id.doctor_emailadd);
        doctor_birthdate = (EditText) findViewById(R.id.doctor_birthdate);

        guard_lname = (EditText) findViewById(R.id.guard_lname);
        guard_mname = (EditText) findViewById(R.id.guard_mname);
        guard_fname = (EditText) findViewById(R.id.guard_fname);
        guard_relationship = (EditText) findViewById(R.id.guard_relationship);
        guard_address = (EditText) findViewById(R.id.guard_address);
        guard_number = (EditText) findViewById(R.id.guard_number);
    }
}
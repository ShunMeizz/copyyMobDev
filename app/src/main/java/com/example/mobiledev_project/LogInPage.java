package com.example.mobiledev_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInPage extends AppCompatActivity {
    Button btn1, btn2;
    EditText eLEmail, eLPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
        btn1 = (Button) findViewById(R.id.btn_llogin);
        btn2 = (Button) findViewById(R.id.btn_lsignup);
        eLEmail = (EditText) findViewById(R.id.eLEmail);
        eLPassword = (EditText) findViewById(R.id.eLPassword);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = eLEmail.getText().toString();
                String password = eLPassword.getText().toString();
                Intent intent = new Intent(LogInPage.this, HomePage.class);
                intent.putExtra("email_key", email);
                intent.putExtra("password_key", password);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(LogInPage.this, RegisterPage.class);
                startActivity(intent1);
            }
        });
    }





}
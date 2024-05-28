package com.example.mobiledev_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import kotlinx.coroutines.channels.Send;

public class SendFlowers extends AppCompatActivity {

    ImageView backButton, shopCart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_flowers);
        backButton = findViewById(R.id.backButtonFlowers);
        shopCart = findViewById(R.id.shopCartFlowers);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendFlowers.this, HomePage.class));
            }
        });
        shopCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendFlowers.this, AddToCart.class));
            }
        });
    }
}
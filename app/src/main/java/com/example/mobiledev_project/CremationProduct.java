package com.example.mobiledev_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CremationProduct extends AppCompatActivity {
    ImageView backButton, shopCart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cremation_product);
        backButton = findViewById(R.id.backButtonUrn);
        shopCart = findViewById(R.id.shopCartUrn);

        backButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(CremationProduct.this, HomePage.class));
        }
        });
        shopCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CremationProduct.this, AddToCart.class));
            }
        });
    }
}
package com.example.mobiledev_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DeathArchive extends AppCompatActivity {
    ImageView menu, profile;

    // search patay
    EditText search_bar;
    ImageButton search_button;

    // database change
    TextView txtDisplayFullName, txtDisplayFullName1, txtDisplayFullName2;
    TextView txtDeadDate, txtDeadDate1, txtDeadDate2;
    TextView txtDeadAbout, txtDeadAbout1, txtDeadAbout2;

    // button pages
    Button btnVisitDead1, btnVisitDead2, btnVisitDead3;
    Button btnSendflower1, btnSendflower2, btnSendflower3;
    Button btnSendMessage1, btnSendMessage2, btnSendMessage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_archive);

        menu = findViewById(R.id.menu_bar);
        profile = findViewById(R.id.user_profile);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DeathArchive.this, UserProfile.class));
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.choice_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return handleMenuItemClick(item);
            }
        });
        popupMenu.show();
    }

    private boolean handleMenuItemClick(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.mHome:
                Toast.makeText(this, "Home Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DeathArchive.this, HomePage.class));
                return true;
            case R.id.cCremation:
                Toast.makeText(this, "Cremation Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DeathArchive.this, CremationProduct.class));
                return true;
            case R.id.cFuneralRite:
                Toast.makeText(this, "Funeral Rite", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DeathArchive.this, ImmediateNeedForm.class));
                return true;
            case R.id.cSendFlowers:
                Toast.makeText(this, "Send Flowers Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DeathArchive.this, SendFlowers.class));
                return true;
            case R.id.mOrbituary:
                Toast.makeText(this, "Death Archive Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DeathArchive.this, DeathArchive.class));
                return true;
            case R.id.mLogOut:
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                return false;
        }
    }
}
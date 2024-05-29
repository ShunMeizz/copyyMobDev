package com.example.mobiledev_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeathArchive extends AppCompatActivity {
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

    }
}
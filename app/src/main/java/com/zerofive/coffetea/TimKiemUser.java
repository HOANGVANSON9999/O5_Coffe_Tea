package com.zerofive.coffetea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class TimKiemUser extends AppCompatActivity {


    private EditText edt_searchfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tim_kiem_user);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        edt_searchfood = findViewById(R.id.edt_searchfood);
        edt_searchfood.setFocusable(false);
        edt_searchfood.setOnClickListener(v ->{
            Intent intent = new Intent(this, TimKiemCoffeUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
    }
}
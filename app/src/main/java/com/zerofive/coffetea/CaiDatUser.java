package com.zerofive.coffetea;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

public class CaiDatUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat_user);

        findViewById(R.id.img_back).setOnClickListener(v -> {
            Intent intent = new Intent(this, ThongTinUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
        findViewById(R.id.img_nextmk1).setOnClickListener(v -> {
            Intent intent = new Intent(this, DoiMatKhauUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });

    }
}
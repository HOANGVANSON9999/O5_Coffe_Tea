package com.zerofive.coffetea;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_mhc1 = findViewById(R.id.img_mhc1);
        ImageView img_mhc2 = findViewById(R.id.img_mhc2);
        LinearLayout layout_mhc2 = findViewById(R.id.layout_mhc2);

        TextView tv_mhc1 = findViewById(R.id.tv_mhc1);
        TextView tv_mhc2 = findViewById(R.id.tv_mhc2);

        findViewById(R.id.btn_login).setOnClickListener(v ->{
            Intent intent = new Intent(this, DangNhap.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
        findViewById(R.id.btn_signup).setOnClickListener(v ->{
            Intent intent = new Intent(this, Dangky.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });

    }
}
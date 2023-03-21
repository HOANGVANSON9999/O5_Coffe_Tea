package com.zerofive.coffetea;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.TextView;

public class DangNhap extends AppCompatActivity {


    private EditText edt_phone;
    private EditText edt_pass;
    private TextView tv_forgetpass;
    private TextView tv_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);

        edt_phone = findViewById(R.id.edt_phone);
        edt_pass = findViewById(R.id.edt_pass);
        tv_forgetpass = findViewById(R.id.tv_forgetpass);
        tv_signup = findViewById(R.id.tv_signup);

        findViewById(R.id.btn_login).setOnClickListener(v ->{
            if (edt_phone.getText().toString().equalsIgnoreCase("manage@gmail.com") && edt_pass.getText().toString().equalsIgnoreCase("123") ) {
                Intent intent = new Intent(this, TrangChuManage.class);
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                startActivity(intent, bundle);
            } else {
                Intent intent = new Intent(this, TrangChuUser.class);
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
                startActivity(intent, bundle);
            }
        });

        tv_signup.setOnClickListener(v ->{
            Intent intent = new Intent(this, Dangky.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
    }
}
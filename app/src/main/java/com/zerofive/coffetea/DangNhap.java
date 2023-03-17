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
            login();
        });

        tv_forgetpass.setOnClickListener(v ->{
            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });

        tv_signup.setOnClickListener(v ->{
            Intent intent = new Intent(this, DangNhap.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
    }

    private void login(){
        String email = edt_phone.getText().toString();
        String password = edt_pass.getText().toString();

        if (email.isEmpty()) {
            edt_phone.setError("Phone is required!");
            edt_phone.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edt_phone.setError("Please enter a valid phone!");
            edt_phone.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            edt_pass.setError("Password is required!");
            edt_pass.requestFocus();
            return;
        }

        if (password.length() < 6) {
            edt_pass.setError("Min password length should be 6 characters!");
            edt_pass.requestFocus();
            return;
        }




    }
}
package com.zerofive.coffetea;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Dangky extends AppCompatActivity {

    private EditText edt_name;
    private EditText edt_email;
    private EditText edt_phone;
    private EditText edt_pass;
    private TextView tv_login;

    Button btn_signup;
    public static final String BUNDLE = "BUNDLE";
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{6,}" +                // at least 4 characters
                    "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);

        edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_phone = findViewById(R.id.edt_phone);
        edt_pass = findViewById(R.id.edt_pass);
        tv_login = findViewById(R.id.tv_login);
        btn_signup = (Button)findViewById(R.id.btn_signup) ;


        findViewById(R.id.btn_signup).setOnClickListener(v ->{
            Intent intent = new Intent(this, DangNhap.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });


        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)



            {
                //kiểm tra validate false => phải thỏa đk validate
//                if (!validateFullName() | !validateEmail() | !validatePhone() | !validatePassWord()) {
//
//                }
                if (edt_phone.getText().toString().equals("a") && edt_email.getText().toString().equals("b") &&
                        edt_name.getText().toString().equals("c") &&
                        edt_pass.getText().toString().equals("d")) {
                    Toast.makeText(Dangky.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Dangky.this, DangNhap.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Dangky.this, "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });



        tv_login.setOnClickListener(v->{
            Intent intent = new Intent(this, DangNhap.class);
            Bundle bundle = ActivityOptions.makeTaskLaunchBehind().toBundle();
            startActivity(intent, bundle);
        });
    }





    private boolean validateFullName(){
        String val = edt_name.getText().toString().trim();

        if(val.isEmpty()){
            edt_name.setError("Không được để chống");
            return false;
        }else {
            edt_name.setError(null);

            return true;
        }
    }



    private boolean validateEmail(){
        String val = edt_email.getText().toString().trim();
        String checkspaces = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";

        if(val.isEmpty()){
            edt_email.setError("Không được để chống");
            return false;
        }else if(!val.matches(checkspaces)){
            edt_email.setError("Email không hợp lệ!");
            return false;
        }
        else {
            edt_email.setError(null);

            return true;
        }
    }

    private boolean validatePhone(){
        String val = edt_phone.getText().toString().trim();


        if(val.isEmpty()){
            edt_phone.setError("Không được để chống");
            return false;
        }else if(val.length() != 10){
            edt_phone.setError("Số điện thoại không hợp lệ!");
            return false;
        }
        else {
            edt_phone.setError(null);

            return true;
        }
    }

    private boolean validatePassWord(){
        String val = edt_pass.getText().toString().trim();

        if(val.isEmpty()){
            edt_pass.setError("Không được để chống");
            return false;
        }else if(!PASSWORD_PATTERN.matcher(val).matches()){
            edt_pass.setError("Mật khẩu ít nhất 6 ký tự!");
            return false;
        }
        else {
            edt_pass.setError(null);

            return true;
        }
    }


    }

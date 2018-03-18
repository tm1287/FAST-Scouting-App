package com.maraligat.fastscoutingapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText Username_et;
    private EditText Password_et;
    private TextView Login_tv;
    private TextView Register_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    private void init(){
        Username_et = findViewById(R.id.Username_et);
        Password_et = findViewById(R.id.Password_et);
        Login_tv = findViewById(R.id.Login_tv);
        Register_tv = findViewById(R.id.Register_tv);

        Login_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Register_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}

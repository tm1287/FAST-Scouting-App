package com.maraligat.fastscoutingapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText r_UsernameEt;
    private EditText r_PasswordEt;
    private TextView r_SubmitTv;
    private TextView r_LoginTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }


    private void init(){
        r_UsernameEt = findViewById(R.id.r_UsernameEt);
        r_PasswordEt = findViewById(R.id.r_PasswordEt);
        r_SubmitTv = findViewById(R.id.r_SubmitTv);
        r_LoginTv = findViewById(R.id.r_LoginTv);



        r_SubmitTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        r_LoginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }
        });

    }
}

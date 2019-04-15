package com.nelly.bonfirerecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonRegister;
    TextView mViewSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mTextUsername = (EditText) findViewById(R.id.edittext_username);
        mTextPassword = (EditText) findViewById(R.id.edittext_password);
        mViewSignIn = (EditText) findViewById(R.id.edittext_Sigin);
        mButtonRegister =(Button) findViewById(R.id.Button_Register) ;
        mViewSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(sign);
            }
        });
    }
}
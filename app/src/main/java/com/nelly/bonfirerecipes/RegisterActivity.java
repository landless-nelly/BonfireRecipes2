package com.nelly.bonfirerecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mCnf_password;
    Button mButtonRegister;
    TextView mViewSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mTextUsername =(EditText)findViewById(R.id.edittext_username);
        mTextPassword=(EditText)findViewById(R.id.edittext_password);
        mCnf_password=(EditText)findViewById(R.id.edittext_cnf_Password);
        mViewSignIn=(EditText)findViewById(R.id.edittext_Sigin);
        mButtonRegister=(Button)findViewById(R.id.Button_Register);
        mViewSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignInIntent =new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(SignInIntent);
            }
        });
    }
}

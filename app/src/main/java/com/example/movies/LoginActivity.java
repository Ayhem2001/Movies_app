package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt,passEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        initview();
    }

    private void initview() {
        userEdt=findViewById(R.id.editTextText);
        passEdt=findViewById(R.id.editTextText2);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
                Toast.makeText(LoginActivity.this, "Please fill your name and password",Toast.LENGTH_SHORT).show();
            }else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")){
                startActivity(new Intent(LoginActivity.this, IntroActivity.class));
            }else{
                Toast.makeText(LoginActivity.this, "your name and password are not correct",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
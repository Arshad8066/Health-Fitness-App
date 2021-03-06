package com.ravi.firebaseone.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.ravi.firebaseone.MainActivity;
import com.ravi.firebaseone.R;

import java.util.Random;

public class LoginActivity extends AppCompatActivity {


    private EditText mEmail , mPass;
    private TextView mTextView;
    private FirebaseAuth mAuth;
    private String CaptchaString;
    private EditText EditCaptcha;
    private  TextView CaptchaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPass = findViewById(R.id.passsignin);
        mEmail =findViewById(R.id.email);
        Button signInBtn = findViewById(R.id.singin_btn);
        mTextView = findViewById(R.id.textView2);
        EditCaptcha = findViewById(R.id.typecaptcha);
        CaptchaText =findViewById(R.id.captcha_text);
        CaptchaString = captchaGenerator();
        CaptchaText.setText(CaptchaString);

        mAuth = FirebaseAuth.getInstance();



        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this , RegisterActivity.class));
            }
        });
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });



    }
    private void loginUser(){

        if(CaptchaString.equals(EditCaptcha.getText().toString())){

        String email = mEmail.getText().toString();
        String pass = mPass.getText().toString();

        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if (!pass.isEmpty()){
                mAuth.signInWithEmailAndPassword(email , pass)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(LoginActivity.this, "Login Successfully !!", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this , MainActivity.class));
                                finish();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(LoginActivity.this, "Login Failed !!", Toast.LENGTH_SHORT).show();
                    }
                });
            }else{
                mPass.setError("Empty Fields Are not Allowed");
            }
        }else if(email.isEmpty()){
            mEmail.setError("Empty Fields Are not Allowed");
        }else{
            mEmail.setError("Pleas Enter Correct Email");
        }
        }else {
            Toast.makeText(this, "Captcha not matched", Toast.LENGTH_SHORT).show();
        }
    }

    private String captchaGenerator() {
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*+";


        StringBuilder ccode = new StringBuilder();

        Random random = new Random();



        int lenOfAlpha = 8;

        for (int i = 0; i < lenOfAlpha; i++) {
            int index = random.nextInt(code.length());
            char randomSpe = code.charAt(index);

            ccode.append(randomSpe);
        }

        return ccode.toString();
    }
}
package com.saqib.akhbar.signinwithgoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SignoutActivity extends AppCompatActivity {

    FirebaseAuth auth;
    Button signOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signout);
        auth=FirebaseAuth.getInstance();
        signOut=findViewById(R.id.signOut);
        signOut.setOnClickListener(view -> {
            Intent intent=new Intent(SignoutActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
            auth.signOut();
        });


    }
}
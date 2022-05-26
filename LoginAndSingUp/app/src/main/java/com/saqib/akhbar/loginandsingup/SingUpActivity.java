package com.saqib.akhbar.loginandsingup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.saqib.akhbar.loginandsingup.databinding.ActivitySingUpBinding;

import java.util.Objects;

public class SingUpActivity extends AppCompatActivity {

    ActivitySingUpBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();

        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();

        binding.text.setOnClickListener(view -> {
           Intent intent=new Intent(SingUpActivity.this,SignInActivity.class);
           startActivity(intent);
           finish();
        });




        binding.btnSignUp.setOnClickListener(view -> auth.createUserWithEmailAndPassword(binding.editTextTextEmailAddress.getText().toString()
        ,binding.editTextTextPassword.getText().toString())
                .addOnCompleteListener(task -> {
                   if (task.isSuccessful()){
                       Intent intent=new Intent(SingUpActivity.this,MainActivity.class);
                       startActivity(intent);
                       finish();

                       Users users=new Users(binding.editTextTextPersonName.getText().toString(),
                               binding.editTextTextEmailAddress.getText().toString(),
                               binding.editTextTextPassword.getText().toString());

                       String id= Objects.requireNonNull(Objects.requireNonNull(task.getResult()).getUser()).getUid();
                       database.getReference().child("Users").child(id).setValue(users);
                   }else {
                       Toast.makeText(SingUpActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                   }
                }));

        if(auth.getCurrentUser()!=null){
            Intent intent=new Intent(SingUpActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }



    }
}
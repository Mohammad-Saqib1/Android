package com.saqib.akhbar.loginandsingup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("WhatSapp");
        auth=FirebaseAuth.getInstance();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                auth.signOut();
                Intent intent=new Intent(MainActivity.this,SignInActivity.class);
                startActivity(intent);
                finish();

                Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
package com.saqib.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreateMainActivity", Toast.LENGTH_SHORT).show();

        TextView textView=findViewById(R.id.main);
        textView.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,NextActivity.class);
            startActivity(intent);
        });
    }
    
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStartMainActivity", Toast.LENGTH_SHORT).show();
    } @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResumeMainActivity", Toast.LENGTH_SHORT).show();
    } @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPauseMainActivity", Toast.LENGTH_SHORT).show();
    } @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStopMainActivity", Toast.LENGTH_SHORT).show();
    } @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroyMainActivity", Toast.LENGTH_SHORT).show();
    }
}
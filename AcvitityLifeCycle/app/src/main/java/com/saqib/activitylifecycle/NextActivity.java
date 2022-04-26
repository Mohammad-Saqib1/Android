package com.saqib.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Toast toast=Toast.makeText(this,"onCreateNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast=Toast.makeText(this,"onStartNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast=Toast.makeText(this,"onResumeNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast=Toast.makeText(this,"onPauseNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast=Toast.makeText(this,"onStopNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast=Toast.makeText(this,"onDestroyNextActivity",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
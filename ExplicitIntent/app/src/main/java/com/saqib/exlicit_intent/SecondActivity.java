package com.saqib.exlicit_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {


    TextView learn,subcribe;
    String data;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        learn=findViewById(R.id.scnlearn);
        subcribe=findViewById(R.id.subscribe);
        Intent intent=getIntent();
        data=intent.getStringExtra("dataname");
        learn.setText("Learn Android Development With "+data);
        subcribe.setText("Subcribe To "+data);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
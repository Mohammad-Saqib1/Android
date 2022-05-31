package com.saqib.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView first,firstWay,second,secondWay,third,thirdWay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        first=findViewById(R.id.first);
        firstWay=findViewById(R.id.firstway);
        second=findViewById(R.id.second);
        secondWay=findViewById(R.id.secondway);
        third=findViewById(R.id.third);
        thirdWay=findViewById(R.id.thirdway);

        second.setOnClickListener(this);
        secondWay.setOnClickListener(this);

        first.setOnClickListener(view -> Toast.makeText(MainActivity.this, "First", Toast.LENGTH_SHORT).show());
        firstWay.setOnClickListener(view -> Toast.makeText(MainActivity.this, "FirstWay", Toast.LENGTH_SHORT).show());
    }



    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.second:
                Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
                break;

            case R.id.secondway:
                Toast.makeText(this, "SecondWay", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void third(View view){
        Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show();
    }
    public void thirdWay(View view){
        Toast.makeText(this, "ThirdWay", Toast.LENGTH_SHORT).show();
    }
}
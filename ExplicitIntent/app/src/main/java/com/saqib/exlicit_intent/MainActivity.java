package com.saqib.exlicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView neat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neat =findViewById(R.id.neat);
        neat.setOnClickListener(view -> {
            String data=neat.getText().toString();
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("dataname",data);
            startActivity(intent);
        });
    }
}
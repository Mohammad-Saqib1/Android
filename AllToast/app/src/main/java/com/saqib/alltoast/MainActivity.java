package com.saqib.alltoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button byDefault,simpleGravity,nestedGravity;
    @SuppressLint("RtlHardcoded")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byDefault=findViewById(R.id.button);
        simpleGravity=findViewById(R.id.button2);
        nestedGravity=findViewById(R.id.button3);

        byDefault.setOnClickListener(view -> Toast.makeText(this, "By Default Toast", Toast.LENGTH_LONG).show());

        simpleGravity.setOnClickListener(view -> {
            Toast toast=Toast.makeText(MainActivity.this,"Simple Gravity Toast",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        });

        nestedGravity.setOnClickListener(view -> {
            Toast toast=Toast.makeText(MainActivity.this,"Nested Gravity Toast ",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.LEFT | Gravity.BOTTOM,0,0);
            toast.show();
        });
    }
}
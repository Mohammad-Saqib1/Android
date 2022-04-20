package com.saqib.akhbar.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.Click);
        button.setOnClickListener(view -> {
            BottomSheet bottomSheet=new BottomSheet();
            bottomSheet.show(getSupportFragmentManager(),bottomSheet.getTag());
        });
    }
}
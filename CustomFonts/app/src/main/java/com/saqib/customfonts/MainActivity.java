package com.saqib.customfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView hindi,english,urdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        hindi=findViewById(R.id.hindi);
        english=findViewById(R.id.english);
        urdu=findViewById(R.id.urdu);

        Typeface hindiFont=Typeface.createFromAsset(getAssets(),"fonts/hindi.ttf");
        hindi.setTypeface(hindiFont);
        Typeface urduFont=Typeface.createFromAsset(getAssets(),"fonts/urdu.ttf");
        hindi.setTypeface(urduFont);

    }
}
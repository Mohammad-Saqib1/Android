package com.saqib.animations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView animationView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView=findViewById(R.id.animation);
        button=findViewById(R.id.covid);
        setTitle("Going to Covid Test");
        button.setOnClickListener(view -> {
            animationView.setVisibility(View.VISIBLE);
            button.setVisibility(View.INVISIBLE);
            animationView.playAnimation();



        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
        });
    }
}
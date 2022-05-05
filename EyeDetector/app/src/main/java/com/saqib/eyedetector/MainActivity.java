package com.saqib.eyedetector;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LookAtMe lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hello));
        //lookAtMe.setVideoPath("https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4"); //to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }

}
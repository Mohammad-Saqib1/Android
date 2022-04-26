package com.apna.appsopen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView youtube,whatsapp,facebook,instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtube=findViewById(R.id.youtube);
        whatsapp=findViewById(R.id.whatsapp);
        facebook=findViewById(R.id.facebook);
        instagram=findViewById(R.id.instagram);

        youtube.setOnClickListener(view -> gotoUrl("https://www.youtube.com/"));
        whatsapp.setOnClickListener(view -> gotoUrl("https://www.whatsapp.com/"));
        facebook.setOnClickListener(view -> gotoUrl("https://www.facebook.com/"));
        instagram.setOnClickListener(view -> gotoUrl("https://www.instagram.com/"));
    }

    private void gotoUrl(String url) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
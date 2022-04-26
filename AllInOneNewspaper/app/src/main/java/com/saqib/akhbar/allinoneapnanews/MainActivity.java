package com.saqib.akhbar.allinoneapnanews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initialized ImageView
    ImageView aajTak,amarUjala,bbc,dainikBhaskar,deccanChronicle,deccanHerald,dainikJagran,
            google,hindustan,timeOfIndia,inquilab,ndtv,navBharatTimes,patrika,
            prabhatKhabar,hindustanTimes,rajasthanPatrika,siasat,theAsianAge,taasir,theFreePressJournal,
            theHindu,theIndianExpress,theStateman,theTelegraph,zeeNews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Finding imageView By Id
        aajTak=findViewById(R.id.aajtak);
        amarUjala=findViewById(R.id.amarujala);
        bbc=findViewById(R.id.bbc);
        dainikBhaskar=findViewById(R.id.dainikBhaskar);
        deccanChronicle=findViewById(R.id.deccanChronicle);
        deccanHerald=findViewById(R.id.deccanHerald);
        dainikJagran=findViewById(R.id.dainikJagran);
        google=findViewById(R.id.google);
        hindustan=findViewById(R.id.hindustan);
        timeOfIndia=findViewById(R.id.timeOfIndia);
        inquilab=findViewById(R.id.inquilab);
        ndtv=findViewById(R.id.ndtv);
        navBharatTimes=findViewById(R.id.navBharatTimes);
        patrika=findViewById(R.id.patrika);
        prabhatKhabar=findViewById(R.id.prabhatKhabar);
        hindustanTimes=findViewById(R.id.hindustanTimes);
        rajasthanPatrika=findViewById(R.id.rajasthanPatrika);
        siasat=findViewById(R.id.siasat);
        theAsianAge=findViewById(R.id.theAsianAge);
        taasir=findViewById(R.id.taasir);
        theFreePressJournal=findViewById(R.id.freePressJournal);
        theHindu=findViewById(R.id.theHindu);
        theIndianExpress=findViewById(R.id.theIndianExpress);
        theStateman=findViewById(R.id.theStateman);
        theTelegraph=findViewById(R.id.theTelegraph);
        zeeNews=findViewById(R.id.zeeNews);


        // Set On ClickListener
        aajTak.setOnClickListener(view -> clickBtn("https://www.aajtak.in/"));
        amarUjala.setOnClickListener(view -> clickBtn("https://www.amarujala.com/"));
        bbc.setOnClickListener(view -> clickBtn("https://www.bbc.com/news"));
        dainikBhaskar.setOnClickListener(view -> clickBtn("https://www.bhaskar.com/"));
        deccanChronicle.setOnClickListener(view -> clickBtn("https://www.deccanchronicle.com/"));
        deccanHerald.setOnClickListener(view -> clickBtn("https://www.deccanherald.com/"));
        dainikJagran.setOnClickListener(view -> clickBtn("https://www.jagran.com/"));
        google.setOnClickListener(view -> clickBtn("https://news.google.com/"));
        hindustan.setOnClickListener(view -> clickBtn("https://www.livehindustan.com/"));
        timeOfIndia.setOnClickListener(view -> clickBtn("https://timesofindia.indiatimes.com/india"));
        inquilab.setOnClickListener(view -> clickBtn("https://www.inquilab.com/"));
        ndtv.setOnClickListener(view -> clickBtn("https://www.ndtv.com/"));
        navBharatTimes.setOnClickListener(view -> clickBtn("https://navbharattimes.indiatimes.com/"));
        patrika.setOnClickListener(view -> clickBtn("https://www.patrika.com/"));
        prabhatKhabar.setOnClickListener(view -> clickBtn("https://www.prabhatkhabar.com/"));
        hindustanTimes.setOnClickListener(view -> clickBtn("https://www.hindustantimes.com/"));
        rajasthanPatrika.setOnClickListener(view -> clickBtn("https://epaper.patrika.com/"));
        siasat.setOnClickListener(view -> clickBtn("https://www.siasat.com/"));
        theAsianAge.setOnClickListener(view -> clickBtn("https://www.asianage.com/"));
        taasir.setOnClickListener(view -> clickBtn("https://taasir.com/"));
        theFreePressJournal.setOnClickListener(view -> clickBtn("https://www.freepressjournal.in/"));
        theHindu.setOnClickListener(view -> clickBtn("https://www.thehindu.com/"));
        theIndianExpress.setOnClickListener(view -> clickBtn("https://indianexpress.com/"));
        theStateman.setOnClickListener(view -> clickBtn("https://www.thestatesman.com/"));
        theTelegraph.setOnClickListener(view -> clickBtn("https://www.telegraphindia.com/"));
        zeeNews.setOnClickListener(view -> clickBtn("https://zeenews.india.com/"));








    }


    //ClickButton Function
    public void clickBtn(String url){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //setToolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.shareBtn:
                //share
                try {
                    Intent intent=new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"OSAM APP");
                    String shareMessage="https://play.google.com/store/apps/details?="+ BuildConfig.APPLICATION_ID+"\n\n";
                    intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                    startActivity(Intent.createChooser(intent,"Share Via"));
                }catch(Exception e){
                    Toast.makeText(MainActivity.this,"Error Occured",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rateUsBtn:
                //Rate us
                try {
                    Uri uri=Uri.parse("market://details?id="+
                            getPackageName());
                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id="+
                            getPackageName());
                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }

                break;

            case R.id.contacts:
                Intent intent=new Intent(MainActivity.this,PublisherActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}
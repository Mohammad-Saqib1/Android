package com.saqib.akhbar.allinoneakhbar;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,R.id.nav_google,R.id.nav_hindustan_times,R.id.nav_ndtv,R.id.nav_ndtv
                ,R.id.nav_ttoi,R.id.nav_the_asian_age,R.id.nav_freepress,R.id.nav_the_hindu,R.id.nav_telegraph,R.id.nav_statesman,
                R.id.nav_indian_Express,R.id.nav_zee_news,R.id.nav_aaj_tak,R.id.nav_amarujala,R.id.nav_danik_jagran,R.id.nav_dainik_bhaskar,
                R.id.nav_hindustan,R.id.nav_navbharat_times,R.id.nav_patrika,R.id.nav_prabhat_khabar,R.id.nav_rajasthan_patrika,
                R.id.nav_taasir,R.id.nav_inqulab,R.id.nav_siyasat)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.acction_rateus:
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

            case R.id.acction_contactP:
                    Intent intent1=new Intent(MainActivity.this,ContactActivity.class);
                    startActivity(intent1);
                break;
            case R.id.acction_share:
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
        }
        return false;
    }
}
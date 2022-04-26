package com.saqib.akhbar.bottomnavigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.saqib.akhbar.bottomnavigation.Fragment.HomeFragment;
import com.saqib.akhbar.bottomnavigation.Fragment.LogoutFragment;
import com.saqib.akhbar.bottomnavigation.Fragment.MenuFragment;
import com.saqib.akhbar.bottomnavigation.Fragment.MessageFragment;
import com.saqib.akhbar.bottomnavigation.Fragment.SearchFragment;

public class CustomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    LinearLayout linearLayout;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        linearLayout=findViewById(R.id.customLayout);

        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.customLayout,new HomeFragment());
        transaction1.commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()){
                case R.id.home:
                    transaction.replace(R.id.customLayout,new HomeFragment());
                    break;
                case R.id.search:
                    transaction.replace(R.id.customLayout,new SearchFragment());
                    break;
                case R.id.logout:
                    transaction.replace(R.id.customLayout,new LogoutFragment());
                    break;
                case R.id.more:
                    transaction.replace(R.id.customLayout,new MenuFragment());
                    break;
                case R.id.messeage:
                    transaction.replace(R.id.customLayout,new MessageFragment());
                    break;

            }
            transaction.commit();
            return true;
        });
    }
}
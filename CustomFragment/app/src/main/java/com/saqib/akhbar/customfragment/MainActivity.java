package com.saqib.akhbar.customfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.saqib.akhbar.customfragment.Fragment.heartFrag;
import com.saqib.akhbar.customfragment.Fragment.homeFrag;
import com.saqib.akhbar.customfragment.Fragment.igtvFrag;
import com.saqib.akhbar.customfragment.Fragment.searchFrag;
import com.saqib.akhbar.customfragment.Fragment.userFrag;

public class MainActivity extends AppCompatActivity {

    ImageView home,search,igtv,heart,user;
    LinearLayout linearLayout;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        


        home=findViewById(R.id.home);
        search=findViewById(R.id.search);
        igtv=findViewById(R.id.igtv);
        heart=findViewById(R.id.heart);
        user=findViewById(R.id.user);
        linearLayout=findViewById(R.id.linearLayout);



        home.setOnClickListener(view -> {
            homeFrag hf=new homeFrag();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,hf);
            transaction.commit();
        });

        search.setOnClickListener(view -> {
            searchFrag sf=new searchFrag();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,sf);
            transaction.commit();
        });

        igtv.setOnClickListener(view -> {
            igtvFrag Igf=new igtvFrag();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,Igf);
            transaction.commit();
        });

        heart.setOnClickListener(view -> {
            heartFrag hrf=new heartFrag();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,hrf);
            transaction.commit();
        });

        user.setOnClickListener(view -> {
            userFrag uf=new userFrag();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,uf);
            transaction.commit();
        });


    }
}
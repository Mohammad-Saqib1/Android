package com.saqib.akhbar.fragmenttoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView search;
    LinearLayout linearLayout;
    ImageView btSearch;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        search=findViewById(R.id.search);
        linearLayout=findViewById(R.id.linearLayout);

        search.setOnClickListener(view -> {
            SimpleFargement sf=new SimpleFargement();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout,sf);
            transaction.commit();
        });

        btSearch=findViewById(R.id.btsearch);
        etSearch=findViewById(R.id.txsearch);

        btSearch.setOnClickListener(view -> Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show());
        etSearch.setOnClickListener(view -> Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show());
    }
}
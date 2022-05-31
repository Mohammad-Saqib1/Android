package com.saqib.akhbar.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.saqib.akhbar.viewbinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.textview.setOnClickListener(view -> {
            Toast.makeText(this, "View Binding On MainActivity", Toast.LENGTH_SHORT).show();
        });
    }
}
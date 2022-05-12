package com.myapplication.FoodDeleveryApp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.myapplication.FoodDeleveryApp.Activities.OrderActivity;
import com.myapplication.FoodDeleveryApp.Adapters.MainAdapter;
import com.myapplication.FoodDeleveryApp.Models.MainModel;
import com.myapplication.FoodDeleveryApp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.food1,"Burger","5","Burger with extra cheese"));
        list.add(new MainModel(R.drawable.food2,"Burger Cheese","6","Burger with extra cheese"));
        list.add(new MainModel(R.drawable.food5,"Chicken","7","Chicken  with extra Malai"));
        list.add(new MainModel(R.drawable.food1,"Veg Burger","8","Veg burger with extra cheese"));
        list.add(new MainModel(R.drawable.food2,"Chicken Burger","9","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.food5,"Chicken Qawab","10","Chicken Qawab with extra cheese"));




        MainAdapter adapter=new MainAdapter(this,list);
        binding.recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.myOrders:
                Intent intent=new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
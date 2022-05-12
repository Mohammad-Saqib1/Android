package com.myapplication.FoodDeleveryApp.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.myapplication.FoodDeleveryApp.Adapters.OrderAdapter;
import com.myapplication.FoodDeleveryApp.DBHelper;
import com.myapplication.FoodDeleveryApp.Models.OrderModel;
import com.myapplication.FoodDeleveryApp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Read Data
        DBHelper helper=new DBHelper(this);
        ArrayList<OrderModel> list=helper.getOrders();



        OrderAdapter adapter=new OrderAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(linearLayoutManager);



    }
}
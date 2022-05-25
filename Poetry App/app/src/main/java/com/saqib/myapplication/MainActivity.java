package com.saqib.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.saqib.myapplication.Adapters.Adapter;
import com.saqib.myapplication.Api.ApiInstance;
import com.saqib.myapplication.JavaClasses.RetrofitInstance;
import com.saqib.myapplication.Models.PoetryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ApiInstance apiInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        apiInstance= RetrofitInstance.getRetrofit().create(ApiInstance.class);
       apiInstance.getpoetry().enqueue(new Callback<getResponse>() {
           @Override
           public void onResponse(@NonNull Call<getResponse> call, @NonNull Response<getResponse> response) {
               assert response.body() != null;
               if(response!=null){
                   if(response.body().getStatus().equals("1")){

                       List<PoetryModel> models= (List<PoetryModel>) response.body();
                       Adapter adapter=new Adapter(MainActivity.this,models);
                       recyclerView.setAdapter(adapter);
                       LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
                       recyclerView.setLayoutManager(linearLayoutManager);

                       Toast.makeText(MainActivity.this, "List Is Not Empty", Toast.LENGTH_LONG).show();

                   }else{
                       Toast.makeText(MainActivity.this, "List Is Empty", Toast.LENGTH_LONG).show();
                   }
               }

           }

           @Override
           public void onFailure(@NonNull Call<getResponse> call, @NonNull Throwable t) {

           }
       });


    }
}
package com.saqib.akhbar.api;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);


        apiInterface=RetrofitInstance.getRetrofit().create(ApiInterface.class);
        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(@NonNull Call<List<PostPojo>> call, @NonNull Response<List<PostPojo>> response) {
                assert response.body() != null;
                if(response.body().size()>0){
                    List<PostPojo> postPojoList=response.body();
                    Adapter adapter=new Adapter(postPojoList,MainActivity.this);
                    LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(adapter);

                }
                else {
                    Toast.makeText(MainActivity.this, "List is Empty", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<PostPojo>> call, @NonNull Throwable t) {

                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.saqib.recyclerviewsaqib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.saqib.recyclerviewsaqib.Adapters.RecipeAdapter;
import com.saqib.recyclerviewsaqib.Classes.RecyclerItemClickListener;
import com.saqib.recyclerviewsaqib.Model.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<RecipeModel> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView= findViewById(R.id.recyclerview);
        list.add(new RecipeModel(R.drawable.food1,"Burger 1"));
        list.add(new RecipeModel(R.drawable.food2,"Burger 2"));
        list.add(new RecipeModel(R.drawable.food3,"Burger 3"));
        list.add(new RecipeModel(R.drawable.food4,"Burger 4"));
        list.add(new RecipeModel(R.drawable.food5,"Burger 5"));
        list.add(new RecipeModel(R.drawable.food1,"Burger 6"));
        list.add(new RecipeModel(R.drawable.food2,"Burger 7"));
        list.add(new RecipeModel(R.drawable.food3,"Burger 8"));
        list.add(new RecipeModel(R.drawable.food4,"Burger 9"));
        list.add(new RecipeModel(R.drawable.food5,"Burger 10"));
        list.add(new RecipeModel(R.drawable.food1,"Burger 11"));
        list.add(new RecipeModel(R.drawable.food2,"Burger 12"));
        list.add(new RecipeModel(R.drawable.food3,"Burger 13"));
        list.add(new RecipeModel(R.drawable.food4,"Burger 14"));
        list.add(new RecipeModel(R.drawable.food5,"Burger 15"));

        RecipeAdapter adapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "ImageView 1 Clicked", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "ImageView 2 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                        case 2:
                        Toast.makeText(MainActivity.this, "ImageView 3 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                        case 3:
                        Toast.makeText(MainActivity.this, "ImageView 4 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                        case 4:
                        Toast.makeText(MainActivity.this, "ImageView 5 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "ImageView 6 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "ImageView 7 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "ImageView 8 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "ImageView 9 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "ImageView 10 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, "ImageView 11 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Toast.makeText(MainActivity.this, "ImageView 12 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Toast.makeText(MainActivity.this, "ImageView 13 Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Default ImageView Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                switch (position){
                    case 14:
                        Toast.makeText(MainActivity.this, "LongItemClick 15", Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        Toast.makeText(MainActivity.this, "LongItemClick 14", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Long Click For 14 to 15 Items", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }));

    }
}
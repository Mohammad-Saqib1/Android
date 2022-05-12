package com.myapplication.FoodDeleveryApp.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.myapplication.FoodDeleveryApp.DBHelper;
import com.myapplication.FoodDeleveryApp.R;
import com.myapplication.FoodDeleveryApp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    TextView quantity;
    int count=1;
    ActivityDetailBinding binding;
    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        quantity=findViewById(R.id.quantity);
        binding.add.setOnClickListener(view -> {
            count++;
            quantity.setText(" "+ count);
        });

         binding.subs.setOnClickListener(view -> {
             if (count<=0){
                 Toast.makeText(this, "0 Items", Toast.LENGTH_SHORT).show();
             }
             else {
                 count--;
                 quantity.setText(" "+ count);
             }

        });



        final int image=getIntent().getIntExtra("image",0);
        final int price=Integer.parseInt(getIntent().getStringExtra("price"));
        final String name=getIntent().getStringExtra("name");
        final String description=getIntent().getStringExtra("desc");
//
        binding.detailImage.setImageResource(image);
        binding.priceLevel.setText(String.format("%d",price));
        binding.nameBoxFood.setText(name);
        binding.detailDescription.setText(description);

        DBHelper helper=new DBHelper(this);
        binding.orderNow.setOnClickListener(view -> {
            boolean isInserted=helper.insertOrder(
                    binding.nameBox.getText().toString(),
                    binding.PhoneBox.getText().toString(),
                    price,
                    image,
                    name,
                    description,
                    Integer.parseInt(binding.quantity.getText().toString())

            );
            if(isInserted)
                Toast.makeText(DetailActivity.this, "Data Success", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(DetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
        });


    }
}
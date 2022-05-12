package com.myapplication.FoodDeleveryApp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myapplication.FoodDeleveryApp.Activities.DetailActivity;
import com.myapplication.FoodDeleveryApp.Models.MainModel;
import com.myapplication.FoodDeleveryApp.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder>{


    Context context;

    public MainAdapter(Context context, ArrayList<MainModel> list) {
        this.context = context;
        this.list = list;
    }

    ArrayList<MainModel> list;
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final MainModel model=list.get(position);
        holder.foodImage.setImageResource(model.getPic());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, DetailActivity.class);
            intent.putExtra("image",model.getPic());
            intent.putExtra("price",model.getPrice());
            intent.putExtra("desc",model.getDescription());
            intent.putExtra("name",model.getName());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView mainName,price,description;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage=itemView.findViewById(R.id.foodImage);
            mainName=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
            description=itemView.findViewById(R.id.description);
        }
    }

}

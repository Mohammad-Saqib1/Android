package com.saqib.akhbar.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    List<PostPojo> list;

    Context context;

    public Adapter(List<PostPojo> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.desing,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        PostPojo postPojo=list.get(position);
        holder.textViewTitle.setText(postPojo.getTitle());
        holder.textViewBody.setText(postPojo.getBody());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView textViewBody,textViewTitle;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textViewBody=itemView.findViewById(R.id.bodytextview);
            textViewTitle=itemView.findViewById(R.id.titletextview);

        }
    }
}

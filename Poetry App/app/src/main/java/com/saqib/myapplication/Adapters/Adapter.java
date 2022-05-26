package com.saqib.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saqib.myapplication.Models.PoetryModel;
import com.saqib.myapplication.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    Context context;
    List<PoetryModel> poetryModelList;

    public Adapter(Context context, List<PoetryModel> poetryModelList) {
        this.context = context;
        this.poetryModelList = poetryModelList;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.poetry_layout_recyclerview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        PoetryModel poetryModel=poetryModelList.get(position);
        holder.poet_name.setText(poetryModel.getPoet_name());
        holder.poetry_data.setText(poetryModel.getPoetry());
        holder.date_time.setText(poetryModel.getDate_time());
        
    }

    @Override
    public int getItemCount() {

        return poetryModelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView poet_name,poetry_data,date_time;
        Button update_btn,delete_btn;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            poet_name=itemView.findViewById(R.id.textView_poet_name);
            poetry_data=itemView.findViewById(R.id.textView_poetry_data);
            date_time=itemView.findViewById(R.id.textView_date_time);
            update_btn=itemView.findViewById(R.id.update_btn);
            delete_btn=itemView.findViewById(R.id.delete_btn);

        }
    }
}

package com.saqib.akhbar.fragmenttoactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SimpleFargement extends Fragment {



    public SimpleFargement() {
        // Required empty public constructor
    }

   TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_simple_fargement, container, false);
        textView=view.findViewById(R.id.textviewsearch);


        textView.setOnClickListener(view1 -> {
            Intent intent=new Intent(getContext(),NewActivity.class);
            startActivity(intent);

        });


        return view;
    }
}
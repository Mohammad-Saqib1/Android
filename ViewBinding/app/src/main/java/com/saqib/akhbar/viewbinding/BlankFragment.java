package com.saqib.akhbar.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.saqib.akhbar.viewbinding.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {



    public BlankFragment() {
        // Required empty public constructor
    }

   FragmentBlankBinding fragmentBlankBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentBlankBinding=FragmentBlankBinding.inflate(inflater,container,false);

        fragmentBlankBinding.tvfrag.setOnClickListener(view -> {
            Toast.makeText(getContext(), "View Binding On Fragment", Toast.LENGTH_SHORT).show();
        });

        return fragmentBlankBinding.getRoot();
    }
}
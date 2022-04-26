package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class the_asian_age extends Fragment {



    public the_asian_age() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_the_asian_age, container, false);
        WebView webView=root.findViewById(R.id.asianage);
        webView.loadUrl("https://www.asianage.com/");

        return root;
    }
}
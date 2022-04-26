package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class hindustan_times extends Fragment {



    public hindustan_times() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_hindustan_times, container, false);
        WebView webView=root.findViewById(R.id.hindustantimes);
        webView.loadUrl("https://www.hindustantimes.com/");

        return root;
    }
}
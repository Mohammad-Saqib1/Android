package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class rajasthan_patrika extends Fragment {


    public rajasthan_patrika() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_rajasthan_patrika, container, false);
        WebView webView=root.findViewById(R.id.rajasthanatrika);
        webView.loadUrl("https://epaper.patrika.com/");

        return root;
    }
}
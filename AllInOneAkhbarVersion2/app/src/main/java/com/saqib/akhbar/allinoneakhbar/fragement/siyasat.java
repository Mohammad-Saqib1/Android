package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class siyasat extends Fragment {



    public siyasat() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_siyasat, container, false);
        WebView webView=root.findViewById(R.id.siyasat);
        webView.loadUrl("https://www.siasat.com/");

        return root;
    }
}
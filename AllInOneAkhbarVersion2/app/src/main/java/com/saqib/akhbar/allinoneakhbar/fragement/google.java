package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;
import com.saqib.akhbar.allinoneakhbar.WebViewController;

public class google extends Fragment {


    public google() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_google, container, false);
        WebView webView=root.findViewById(R.id.google);
        webView.loadUrl("https://news.google.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
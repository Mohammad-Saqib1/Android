package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class prabhat_khabar extends Fragment {



    public prabhat_khabar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_prabhat_khabar, container, false);
        WebView webView=root.findViewById(R.id.prabhatkhabar);
        webView.loadUrl("https://www.prabhatkhabar.com/");

        return root;
    }
}
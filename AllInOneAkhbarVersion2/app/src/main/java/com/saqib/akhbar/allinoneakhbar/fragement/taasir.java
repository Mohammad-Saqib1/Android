package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;

public class taasir extends Fragment {


    public taasir() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_taasir, container, false);
        WebView webView=root.findViewById(R.id.taasir);
        webView.loadUrl("https://taasir.com/");

        return root;
    }
}
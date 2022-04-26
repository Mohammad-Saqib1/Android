package com.saqib.akhbar.allinoneakhbar.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.saqib.akhbar.allinoneakhbar.R;


public class ttoi extends Fragment {




    public ttoi() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_ttoi, container, false);
        WebView webView = root.findViewById(R.id.timesofindia);
        webView.loadUrl("https://timesofindia.indiatimes.com/india");

        return root;
    }
}
package com.saqib.akhbar.allinoneakhbar.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.saqib.akhbar.allinoneakhbar.R;
import com.saqib.akhbar.allinoneakhbar.WebViewController;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        WebView webView=root.findViewById(R.id.bbc);
        webView.loadUrl("https://www.bbc.com/news");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
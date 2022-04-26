package com.saqib.akhbar.allinoneakhbar.ui.gallery;

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

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        WebView webView=root.findViewById(R.id.deccanherald);
        webView.loadUrl("https://www.deccanherald.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
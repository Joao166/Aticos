package com.example.aticos;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) findViewById(R.id.webview);
        String myurl = ("file:///android_asset/index.html");
        view.loadUrl (myurl);

    }
}


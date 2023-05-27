package com.example.aticos;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        // Habilitar suporte para JavaScript (opcional)
        webView.getSettings().setJavaScriptEnabled(true);

        // Carregar a página HTML inicial
        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        // Verificar se há histórico de navegação na WebView
        if (webView.canGoBack()) {
            webView.goBack(); // Voltar para a página anterior
        } else {
            super.onBackPressed(); // Comportamento padrão ao pressionar o botão de voltar
        }
    }
    private class CustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // Intercepta o carregamento dos links para evitar abrir em um navegador externo
            view.loadUrl(url);
            return true;
        }
    }
}


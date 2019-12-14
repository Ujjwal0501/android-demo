package com.ujjwal.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.google.com");

        webView.setWebViewClient(new WebViewClient());

        Button btn = findViewById(R.id.button);
        final EditText url = findViewById(R.id.url);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(url.getText().toString());
            }
        });

        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String Url = webView.getUrl();
                url.setText(Url);
                return false;
            }
        });
    }
}

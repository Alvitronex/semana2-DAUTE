package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {


    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webView1 = (WebView) findViewById(R.id.webView);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("Direccion");
        webView1.loadUrl("http://"+dato);

    }
    public void finalizar (View v){
        finish();
    }

}
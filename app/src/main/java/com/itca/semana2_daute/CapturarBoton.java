package com.itca.semana2_daute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class CapturarBoton extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar_boton);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

    }

    //ESTE METODO SE EJECUTARA CUANDO SE PRECIONE EL BOTON
    public void sumar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nr1= Integer.parseInt(valor1);
        int nr2= Integer.parseInt(valor2);
        int suma= nr1+nr2;
        String resu = String.valueOf(suma);
        tv3.setText(resu);
    }
}
package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.view.Menu;


public class ControlImagenButton extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_imagen_button);

        tv1 = (TextView) findViewById(R.id.tv1);
    }

    //Este metodo se ejecutara cuando se presione el ImagenButton
    public void llamar(View view) {
        tv1.setText("Calling Now!!");
    }
}
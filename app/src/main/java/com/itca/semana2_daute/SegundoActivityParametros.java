package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundoActivityParametros extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_parametros);

        et1 = (EditText) findViewById(R.id.et1);
    }
    public void ver(View view){
        Intent i=new Intent(this,Activity2.class);
        i.putExtra("Direccion",et1.getText().toString());
        startActivity(i);
    }
}
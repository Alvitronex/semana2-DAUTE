package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Notificaciones extends AppCompatActivity {
    private EditText et1;
    private  int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        et1=(EditText) findViewById(R.id.et1);
        num = (int) (Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this, cadena,Toast.LENGTH_LONG);
        notificacion.show();

    }
    public void controlar(View view){
        String valorIngresado = et1.getText().toString();
        int valor = Integer.parseInt(valorIngresado);
        if (valor==num){
            Toast notificacion=Toast.makeText(this,"Muy bien recordastes el numero mostrado",Toast.LENGTH_LONG);
            notificacion.show();
        }
        else {
            Toast notificacion=Toast.makeText(this,"Losiento pero no es el numero que usted ingreso",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
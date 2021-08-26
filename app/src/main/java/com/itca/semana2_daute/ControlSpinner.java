package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ControlSpinner extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_spinner);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

        spinner1=(Spinner)findViewById(R.id.spinner);
        String []opciones={"opciones", "sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void resolver(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();


            int nro1=Integer.parseInt(valor1);
            int nro2= Integer.parseInt(valor2);
            String select=spinner1.getSelectedItem().toString();

            if (select.equals("opciones")){
                Toast.makeText(this, "ERROR: Por valor seleccione una opccion", Toast.LENGTH_SHORT).show();
            }else
            if (select.equals("sumar")){
                int suma=nro1+nro2;
                //String resu= String.valueOf(suma);
                tv3.setText("La suma es:"+suma);
            }else
            if (select.equals("restar")){
                int resta=nro1-nro2;
                //String resu = String.valueOf(resta);
                tv3.setText("La resta es:"+resta);
            }else
            if (select.equals("multiplicar")){
                int multi=nro1*nro2;
                //String resu= String.valueOf(multi);
                tv3.setText("La multiplicacion es:"+multi);
            }else
            if (select.equals("dividir")){
                if (nro2==0){
                    Toast.makeText(this, "Error, divicion entre cero", Toast.LENGTH_SHORT).show();
                    et1.setText("0");
                    et2.setText("0");
                    tv3.setText("0");
                }else{
                    int divi=nro1/nro2;
                    //String resu= String.valueOf(divi);
                    tv3.setText("La divicion es:"+divi);
                }
            }
        }
    }
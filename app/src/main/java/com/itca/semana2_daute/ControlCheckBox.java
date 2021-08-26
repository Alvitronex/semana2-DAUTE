package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ControlCheckBox extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private CheckBox checkBox1, checkBox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_check_box);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

        checkBox1=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
    }

    public void resolver(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        String resu= "";

            int nro1=Integer.parseInt(valor1);
            int nro2= Integer.parseInt(valor2);
            if (checkBox1.isChecked()==true){
                int suma=nro1+nro2;
                resu="La suma es: " + suma;
            }
            if (checkBox2.isChecked()==true){
                int resta=nro1-nro2;
                resu="La resta es: " + resta;
            }
            tv3.setText(resu);
        }
    }

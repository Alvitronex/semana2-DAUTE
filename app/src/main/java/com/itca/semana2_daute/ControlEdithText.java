package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ControlEdithText extends AppCompatActivity {
    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_edith_text);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText)  findViewById(R.id.et2);
    }
    public void verificar (View view) {
        String clave = et2.getText().toString();
        if (clave.length() == 0) {
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
package com.itca.semana2_daute;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.itca.semana2_daute.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Actividad no disponible por el momento", Snackbar.LENGTH_LONG)
                        .setAction("Actividad", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.pantalla1){

            //LLAMADO HACIA OTRA MainActivity
            Intent intent = new Intent(MainActivity.this, CapturarBoton.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla2) {

            Intent intent = new Intent(MainActivity.this, RadioGroup.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla3) {

            Intent intent = new Intent(MainActivity.this, ControlCheckBox.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla4) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla5) {
            Intent intent = new Intent(MainActivity.this, ControlListView.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla6) {
            Intent intent = new Intent(MainActivity.this, ControlImagenButton.class);
            startActivity(intent);
            return true;
        }
       if (id == R.id.pantalla7) {
            Intent intent = new Intent(MainActivity.this, Notificaciones.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla8) {
            Intent intent = new Intent(MainActivity.this, ControlEdithText.class);
            startActivity(intent);
            return true;
        }
        /*if (id == R.id.pantalla9) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla10) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla11) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla12) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla13) {
            Intent intent = new Intent(MainActivity.this, ControlSpinner.class);
            startActivity(intent);
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }




    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
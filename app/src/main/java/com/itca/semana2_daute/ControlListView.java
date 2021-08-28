package com.itca.semana2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ControlListView extends AppCompatActivity {
    private  String [] paises = { "Argentina", "Chile", "Paraguay", "Bolivia", "Peru",
                                    "Ecuador", "Brazil", "Colombia", "Venezuela", "Uruguay"};
    private String [] habitantes = {"40000000", "17000000", "65000000", "10000000",
                                    "30000000", "14000000", "183000000", "44000000", "29000000","35000000"};
    private TextView tv1;
    private ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_control_list_view);

    tv1 = (TextView) findViewById(R.id.tv1);
    lv1 = (ListView) findViewById(R.id.listView);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises);
    lv1.setAdapter(adapter);
    lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView  parent, View  view, int position, long id) {
            tv1.setText("Poblacion de "+ lv1.getItemAtPosition(position) + " es " +
                    habitantes[position]);

        }
    });
}

}
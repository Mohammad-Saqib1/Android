package com.saqib.listviewsaqib;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] cities={"Mumbai","Jaipur","Delhi","Agra","Banaras","Patna","Ajmer","Goa","Banglore","Himachal",
            "Lucknow","Aligarh","Gaya","Ludhiyana","Kashmir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<>
                (MainActivity.this, android.R.layout.simple_dropdown_item_1line,cities);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(this, "Click "+cities[i], Toast.LENGTH_SHORT).show());
    }
}
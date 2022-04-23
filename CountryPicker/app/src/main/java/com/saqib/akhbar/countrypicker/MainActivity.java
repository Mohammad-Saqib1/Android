package com.saqib.akhbar.countrypicker;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rilixtech.widget.countrycodepicker.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ccp=findViewById(R.id.ccp);

        ccp.setOnCountryChangeListener(selectedCountry -> Toast.makeText(getApplicationContext(), "Updated " + selectedCountry.getName(), Toast.LENGTH_SHORT).show());
    }
}
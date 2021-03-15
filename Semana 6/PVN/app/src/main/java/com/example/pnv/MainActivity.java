package com.example.pnv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_PNV);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinners
        Spinner spinnerCiudad = (Spinner)  findViewById(R.id.spinnerCiudad);
        Spinner spinnerEPS = (Spinner) findViewById(R.id.spinnerEPS);
        Spinner spinnerIPS = (Spinner)  findViewById(R.id.spinnerIPS);
        Spinner spinnerContagio = (Spinner) findViewById(R.id.spinnerContagio);
        Spinner spinnerSintomas = (Spinner)  findViewById(R.id.spinnerSintomas);
        Spinner spinnerEnfermedades = (Spinner) findViewById(R.id.spinnerEnfermedades);

        // Adapters
        ArrayAdapter<CharSequence> adapterCiudad = ArrayAdapter.createFromResource(this,
                R.array.array_ciudad, R.layout.spinner_item);

        ArrayAdapter<CharSequence> adapterEPS = ArrayAdapter.createFromResource(this,
                R.array.array_eps, R.layout.spinner_item);

        ArrayAdapter<CharSequence> adapterIPS = ArrayAdapter.createFromResource(this,
                R.array.array_ips, R.layout.spinner_item);

        ArrayAdapter<CharSequence> adapterContagio = ArrayAdapter.createFromResource(this,
                R.array.array_contagio, R.layout.spinner_item);

        ArrayAdapter<CharSequence> adapterSintomas = ArrayAdapter.createFromResource(this,
                R.array.array_sintomas, R.layout.spinner_item);

        ArrayAdapter<CharSequence> adapterEnfermedades = ArrayAdapter.createFromResource(this,
                R.array.array_enfermedades, R.layout.spinner_item);

        // Specify the layout to use when the list of choices appears
        adapterCiudad.setDropDownViewResource(R.layout.spinner_dropdown_item);
        adapterEPS.setDropDownViewResource(R.layout.spinner_dropdown_item);
        adapterIPS.setDropDownViewResource(R.layout.spinner_dropdown_item);
        adapterContagio.setDropDownViewResource(R.layout.spinner_dropdown_item);
        adapterSintomas.setDropDownViewResource(R.layout.spinner_dropdown_item);
        adapterEnfermedades.setDropDownViewResource(R.layout.spinner_dropdown_item);

        // Apply adapters to the spinners
        spinnerCiudad.setAdapter(adapterCiudad);
        spinnerEPS.setAdapter(adapterEPS);
        spinnerIPS.setAdapter(adapterIPS);
        spinnerContagio.setAdapter(adapterContagio);
        spinnerSintomas.setAdapter(adapterSintomas);
        spinnerEnfermedades.setAdapter(adapterEnfermedades);

    }
}
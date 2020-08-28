package com.example.cambiandotema;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonRojo;
    private Button botonVerde;
    private Button botonAzul;
    private static final int CODE = 12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.botonRojo = findViewById(R.id.boton_rojo);
        this.botonAzul = findViewById(R.id.boton_azul);
        this.botonVerde = findViewById(R.id.boton_verde);

        this.botonRojo.setOnClickListener((v) -> {
//          Intent, para viajar entre una actividad a otra
            Intent intent = new Intent(this, ColorActitity.class);
            intent.putExtra("color", "#F71010");
            startActivityForResult(intent, CODE);
        });

        this.botonVerde.setOnClickListener((v) -> {
//          Intent, para viajar entre una actividad a otra
            Intent intent = new Intent(this, ColorActitity.class);
            intent.putExtra("color", "#A2FF00");
            startActivityForResult(intent, CODE);
        });

        this.botonAzul.setOnClickListener((v) -> {
//          Intent, para viajar entre una actividad a otra
            Intent intent = new Intent(this, ColorActitity.class);
            intent.putExtra("color", "#008BFF");
            startActivityForResult(intent, CODE);
        });

    }



}
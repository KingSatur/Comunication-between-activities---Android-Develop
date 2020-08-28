package com.example.cambiandotema;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ColorActitity extends AppCompatActivity {


    private ConstraintLayout layout;
    private TextView text;
    private FloatingActionButton configButton;
    private static final int CODE = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_actitity);
        this.layout = findViewById(R.id.layout);
        this.text = findViewById(R.id.textView);
        this.configButton = findViewById(R.id.button_config);
        String color = getIntent().getExtras().getString("color");

//        Log.d(color, "onActivityResult: HOLAAAAAAAAAAAA");
        this.text.setText(color);
        this.layout.setBackgroundColor(Color.parseColor(color));
        this.configButton.setOnClickListener((v) -> {
//          Intent, para viajar entre una actividad a otra
            Intent intent = new Intent(this, MainActivity.class);
            startActivityForResult(intent, CODE);
        });

    }


}
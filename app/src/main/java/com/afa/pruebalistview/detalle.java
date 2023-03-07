package com.afa.pruebalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalle extends AppCompatActivity {
    ImageView imagen;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        imagen = findViewById(R.id.bandera_detalle);
        txt = findViewById(R.id.txtDetalle);
    }

}
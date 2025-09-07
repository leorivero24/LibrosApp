package com.example.librosapp.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.librosapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar View Binding
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener datos enviados desde MainActivity
        String titulo = getIntent().getStringExtra("titulo");
        String autor = getIntent().getStringExtra("autor");
        int anio = getIntent().getIntExtra("anio", 0);
        String descripcion = getIntent().getStringExtra("descripcion");

        // Mostrar en la UI
        binding.tvTitulo.setText(titulo != null ? titulo : "Sin título");
        binding.tvAutor.setText("Autor: " + (autor != null ? autor : "Desconocido"));
        binding.tvAnio.setText("Año: " + (anio != 0 ? anio : "-"));
        binding.tvDescripcion.setText(descripcion != null ? descripcion : "");
    }
}

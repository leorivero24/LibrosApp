package com.example.librosapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.librosapp.databinding.ActivityMainBinding;
import com.example.librosapp.model.Libro;
import com.example.librosapp.viewmodel.LibrosViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private LibrosViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar View Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Inicializar ViewModel
        viewModel = new ViewModelProvider(this).get(LibrosViewModel.class);

        // Listener del botón Buscar
        binding.btnBuscar.setOnClickListener(v -> {
            String titulo = binding.etBuscar.getText().toString().trim();

            if (titulo.isEmpty()) {
                Toast.makeText(this, "Ingrese un título para buscar", Toast.LENGTH_SHORT).show();
                return;
            }

            Libro libro = viewModel.buscarLibro(titulo);

            if (libro != null) {
                // Pasar datos a DetailActivity
                Intent intent = new Intent(this, DetailActivity.class);
                intent.putExtra("titulo", libro.getTitulo());
                intent.putExtra("autor", libro.getAutor());
                intent.putExtra("anio", libro.getAnio());
                intent.putExtra("descripcion", libro.getDescripcion());
                startActivity(intent);
            } else {
                Toast.makeText(this, "Libro no encontrado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

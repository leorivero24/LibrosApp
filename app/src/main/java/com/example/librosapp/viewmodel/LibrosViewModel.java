package com.example.librosapp.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.librosapp.model.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibrosViewModel extends ViewModel {

    private final List<Libro> libros;

    public LibrosViewModel() {
        libros = new ArrayList<>();
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Obra maestra del realismo mágico."));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Clásico de la literatura española."));
        libros.add(new Libro("1984", "George Orwell", 1949, "Distopía sobre el control social."));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "Un cuento filosófico para niños y adultos."));
    }

    public Libro buscarLibro(String titulo) {
        if (titulo == null || titulo.isEmpty()) return null;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}


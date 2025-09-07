package com.example.librosapp.model;

public class Libro {
  private String titulo;
  private String autor;
  private int anio;
  private String descripcion;

  public Libro(String titulo, String autor, int anio, String descripcion) {
    this.titulo = titulo;
    this.autor = autor;
    this.anio = anio;
    this.descripcion = descripcion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnio() {
    return anio;
  }

  public String getDescripcion() {
    return descripcion;
  }
}

package org.example;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(float peso, String nombre, String desc, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = desc;
        this.precio = precio;
    }
    public String toString() {
        return "Nombre: " + this.nombre + "\nDescripción: " + this.descripcion + "\nPrecio (clp): " + this.precio + "\nPeso (kg): " + this.peso;
    }
}

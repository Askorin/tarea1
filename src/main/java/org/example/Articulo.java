package org.example;

public class Articulo {
    // Hasta ahora no veo razón de añadir setters para todos los fields, es más, los haría final.
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
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nDescripción: " + this.descripcion + "\nPrecio (clp): " + this.precio + "\nPeso (kg): " + this.peso;
    }
    public float getPeso() {
        return this.peso;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public float getPrecio() {
        return this.precio;
    }
}

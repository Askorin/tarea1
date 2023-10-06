package org.orden;

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

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
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

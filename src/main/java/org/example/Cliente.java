package org.example;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    private ArrayList<OrdenCompra> ordenes;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.ordenes = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<OrdenCompra> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<OrdenCompra> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre: '" + nombre + '\'' +
                ", rut: '" + rut + '\'' +
                ", direccion: " + direccion +
                '}';
    }
}

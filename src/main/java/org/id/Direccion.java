package org.id;

public class Direccion {
    private String direccion;
    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return this.direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

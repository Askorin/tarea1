package org.example;

public class DetalleOrden {
    private Articulo articulo;
    private int cantidad;
    public DetalleOrden(Articulo articulo, int cantidad) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "Artículo: " + this.articulo.getNombre() + "\nCantidad: " + this.cantidad;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    private float calcPrecio() {
        return this.cantidad * articulo.getPrecio();
    }
    public float calcPrecioSinIVA() {
        return calcPrecio();
    }
    public float calcPrecioConIVA() {
        return calcPrecioSinIVA() * 1.19f;
    }
    public float calcPeso() {
        return this.cantidad * articulo.getPeso();
    }
}

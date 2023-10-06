package org.orden;

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

    public float calcPrecioSinIVA() {
        return this.cantidad * articulo.getPrecio();
    }
    public float calcIVA() {
        return calcPrecioSinIVA() * 0.19f;
    }
    public float calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }
    public float calcPeso() {
        return this.cantidad * articulo.getPeso();
    }
}

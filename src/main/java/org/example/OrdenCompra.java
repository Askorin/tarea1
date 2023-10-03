package org.example;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;

    public OrdenCompra(Date fecha, String estado, ArrayList<DetalleOrden> detalles) {
        this.fecha = fecha;
        this.estado = estado;
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<DetalleOrden> getDetalles() {
        return detalles;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setDetalles(ArrayList<DetalleOrden> detalles) {
        this.detalles = detalles;
    }
    public float calcPrecioSinIVA() {
        float retval = 0;
        for (DetalleOrden d : detalles) {
            retval += d.calcPrecioSinIVA();
        }
        return retval;
    }
    public float calcIVA() {
        return calcPrecioSinIVA() * 0.19f;
    }
    public float calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }
    public float calcPeso() {
        float retval = 0;
        for (DetalleOrden d : detalles) {
            retval += d.calcPeso();
        }
        return retval;
    }
}

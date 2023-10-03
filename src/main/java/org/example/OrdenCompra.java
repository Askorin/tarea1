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
}

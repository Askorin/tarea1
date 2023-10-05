package org.example;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private Cliente cliente;

    public OrdenCompra(Date fecha, String estado, ArrayList<DetalleOrden> detalles, Cliente cliente) {
        this.fecha = fecha;
        this.estado = estado;
        this.detalles = detalles;
        this.cliente = cliente;
        // Se aprovecha para asociar la orden de compra con el cliente.
        cliente.getOrdenes().add(this);
    }

    @Override
    public String toString() {
       return "Fecha: " + this.fecha.toString() + "\nEstado: " + this.estado + "\nDetalles: " + this.detalles.toString();
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

    public Cliente getCliente() {
        return cliente;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

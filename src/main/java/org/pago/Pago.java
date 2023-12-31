package org.pago;
import java.util.Date;

abstract public class Pago {
    private float monto;
    private Date fecha;

    public Pago(float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "monto: " + monto +
                ", fecha: " + fecha;
    }
}

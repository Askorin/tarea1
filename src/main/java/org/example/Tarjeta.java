package org.example;
import java.util.Date;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion) {
        super(monto, fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "tipo: '" + tipo + '\'' +
                ", numTransaccion: '" + numTransaccion + '\'' + ", " +
                super.toString() + "} ";
    }
}




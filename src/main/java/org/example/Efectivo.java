package org.example;
import java.util.Date;

public class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }

    @Override
    public String toString() {
        return "Efectivo{" + super.toString() + "} ";
    }

    public float calcDevolucion(float a_pagar) {
        return Math.max(0, getMonto() - a_pagar);
    }
}

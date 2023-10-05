package org.example;
import java.util.Date;

public class Boleta extends DocTributario {
    public Boleta(String numero, String rut, Date fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }

    @Override
    public String toString() {
        return "Boleta" + super.toString();
    }
}

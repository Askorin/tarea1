package org.example;
import java.util.Date;

abstract public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;

    public DocTributario(String numero, String rut, Date fecha, Direccion direccion) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "{" +
                "numero:'" + numero + '\'' +
                ", rut:'" + rut + '\'' +
                ", fecha:" + fecha +
                ", direccion:" + direccion +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

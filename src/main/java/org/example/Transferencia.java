package org.example;
import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Transferencia{" +
                "banco: '" + banco + '\'' +
                ", numCuenta: '" + numCuenta + '\'' + ", " +
                super.toString() + "} ";
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}

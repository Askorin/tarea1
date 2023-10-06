package org.orden;
import org.doctributario.Boleta;
import org.doctributario.DocTributario;
import org.doctributario.Factura;
import org.id.Cliente;
import org.pago.Efectivo;
import org.pago.Pago;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private Cliente cliente;
    private DocTributario docTributario;
    private ArrayList<Pago> pagos;
    public OrdenCompra(Date fecha, String estado, Cliente cliente, String tipoDocTributario) {
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        // Se aprovecha para asociar la orden de compra con el cliente.
        cliente.getOrdenes().add(this);
        this.pagos = new ArrayList<>();
        this.detalles = new ArrayList<>();
        Random rand = new Random();
        String numeroDoc = String.valueOf(rand.nextInt(99999));
        /* Si OrdenCompra no recibe "Factura" o "Boleta" hará una boleta por defecto. */
        if (tipoDocTributario == "Factura") {
            this.docTributario = new Factura(numeroDoc, cliente.getRut(), fecha, cliente.getDireccion());
        } else {
            this.docTributario = new Boleta(numeroDoc, cliente.getRut(), fecha, cliente.getDireccion());
        }
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "fecha: " + fecha +
                ", estado: '" + estado + '\'' +
                ", detalles: " + detalles +
                ", cliente: " + cliente +
                ", docTributario: " + docTributario +
                '}';
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

    public DocTributario getDocTributario() {
        return docTributario;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
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

    public void setDocTributario(DocTributario docTributario) {
        this.docTributario = docTributario;
    }

    public void setPago(ArrayList<Pago> pagos) {
        this.pagos = pagos;
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
    /* Este método crea un detalle de cierta cantidad de artículos dentro de una orden de compra. */
    public void crearDetalle(Articulo articulo, int cantidad) {
        DetalleOrden detalle = new DetalleOrden(articulo, cantidad);
        detalles.add(detalle);
    }
    /*
     * Método que retorna lo que se ha pagado hasta ahora, teniendo en cuenta que se pueden hacer
     * varios pagos en vez de solo uno.
     * Tenía sentido hacerla publica.
     */
    public float getPagado() {
        float pagado = 0;
        for (Pago p : pagos) {
            pagado += p.getMonto();
        }
        return pagado;
    }
    /*
     * Método addPago añadirá un pago a la orden de compra y en caso de ser necesario hará una
     * devolución llamando calcDevolución sobre un pago en efectivo.
     */
    public float addPago(Pago pago) {
        float devolucion = 0;
        if (pago instanceof Efectivo) {
            float a_pagar = calcPrecio() - getPagado();
            devolucion = ((Efectivo) pago).calcDevolucion(a_pagar);
            pago.setMonto(pago.getMonto() - devolucion);
        }
        pagos.add(pago);
        return devolucion;
    }
}

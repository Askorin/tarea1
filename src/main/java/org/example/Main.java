package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creamos un articulo y lo probamos.
        Articulo art1 = new Articulo(10, "Perro", "Es un perro.", 1500);
        // Segundo artículo.
        Articulo art2 = new Articulo(5, "Gato", "Es un gato.", 2300);

        // Creamos un detalle de orden para probar el artículo.
        DetalleOrden det1 = new DetalleOrden(art1, 5);
        // Segunda detalle de orden.
        DetalleOrden det2 = new DetalleOrden(art2, 8);
        // Hacemos un arraylist con los detalles
        ArrayList<DetalleOrden> detalles = new ArrayList<>();
        detalles.add(det1);
        detalles.add(det2);

        // Creamos una dirección para un futuro cliente.
        Direccion dir = new Direccion("Los alamos 244");

        /* Creamos al cliente. */
        Cliente cl1 = new Cliente("Roberto", "20097301-2", dir);

        /* Una fecha para usar */
        Date fecha = new Date(2022, Calendar.JANUARY, 20);
        /* Creamos la orden de compra. */
        /*
        Notar que en el constructor de la Clase OrdenCompra se asocia al cliente la orden de compra.
         */
        OrdenCompra odc = new OrdenCompra(fecha, "Pagado", detalles, cl1);

        /* Un pago */
        Efectivo ef = new Efectivo(1000, fecha);
        Transferencia tr = new Transferencia(1500, fecha, "santander", "12233");
        Tarjeta tj = new Tarjeta(2000, fecha, "Credito", "11001");
        System.out.println(ef);
        System.out.println(tr);
        System.out.println(tj);

    }
}
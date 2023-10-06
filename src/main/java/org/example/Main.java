package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /* Creamos cinco articulos para testeo. */
        Articulo artPerro = new Articulo(30, "Perro", "Es un perro.", 1500);
        Articulo artGato = new Articulo(5, "Gato", "Es un gato.", 2300);
        Articulo artCanario = new Articulo(0.2f, "Canario", "Es un canario.", 500);
        Articulo artLobo = new Articulo(50, "Lobo", "Es un lobo.", 5000);
        Articulo artBallena = new Articulo(3500, "Ballena", "Es una ballena.", 100000);

        /* Creamos direcciones */
        Direccion dir = new Direccion("Los alamos 244");
        Direccion dir2 = new Direccion("Victor Lamas 1500");

        /* Creamos a los clientes. */
        Cliente cl1 = new Cliente("Roberto", "20097301-2", dir);
        Cliente cl2 = new Cliente("Amanda", "11169919-0", dir);
        Cliente cl3 = new Cliente("Eugenio", "99885321-7", dir2);

        /* Creamos cuatro ordenes de compra y una fecha a usar. */
        Date fecha = new Date();
        OrdenCompra odc1 = new OrdenCompra(fecha, "Orden Creada", cl1);
        OrdenCompra odc2 = new OrdenCompra(fecha, "Orden Creada", cl1);
        OrdenCompra odc3 = new OrdenCompra(fecha, "Orden Creada", cl2);
        OrdenCompra odc4 = new OrdenCompra(fecha, "Orden Creada", cl3);

        /* Mostramos a los clientes. */
        System.out.println(" ***** Mostrando clientes ***** ");
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);

        /* Revisamos que los clientes estén asociados con sus ordenes de compra... */
        System.out.println(" ***** Ordenes de clientes ***** ");
        System.out.println(cl1.getOrdenes());
        System.out.println(cl2.getOrdenes());
        System.out.println(cl3.getOrdenes());

        /* Añadimos artículos a las ordenes. */
        odc1.crearDetalle(artGato, 5);
        odc2.crearDetalle(artLobo, 3);
        odc2.crearDetalle(artPerro, 1);
        odc3.crearDetalle(artCanario, 10);
        odc3.crearDetalle(artBallena, 2);
        odc4.crearDetalle(artPerro, 1);
        odc4.crearDetalle(artGato, 1);

        /* Mostramos las ordenes */
        System.out.println("***** Mostrando ordenes de compra ***** ");
        System.out.println(odc1);
        System.out.println(odc2);
        System.out.println(odc3);
        System.out.println(odc4);

        /* Generamos los documentos tributarios */

        /* Empezamos pagando la orden de compra 1. */
        System.out.println(" ***** Pagando odc1 ***** ");
        Efectivo ef = new Efectivo(25000, fecha);
        System.out.println("Devolución: " + odc1.addPago(ef));
        System.out.println("Pagado: " + odc1.getPagado() + " de " + odc1.calcPrecio());

        System.out.println(" ***** Pagando odc2 ***** ");
        Transferencia trf = new Transferencia(5000, fecha, "Santander", "11111");
        System.out.println("Devolución: " + odc2.addPago(trf));
        System.out.println("Pagado: " + odc2.getPagado() + " de " + odc2.calcPrecio());
        Efectivo ef2 = new Efectivo(10000, fecha);
        System.out.println("Devolución: " + odc2.addPago(ef2));
        System.out.println("Pagado: " + odc2.getPagado() + " de " + odc2.calcPrecio());

        System.out.println(" ***** Pagando odc3 ***** ");
        Tarjeta tj = new Tarjeta(50000, fecha, "Credito", "10101010");
        System.out.println("Devolución: " + odc3.addPago(tj));
        System.out.println("Pagado: " + odc3.getPagado() + " de " + odc3.calcPrecio());

        System.out.println(" ***** Pagando odc4 ***** ");
        Efectivo ef3 = new Efectivo(500000, fecha);
        System.out.println("Devolución: " + odc4.addPago(ef3));
        System.out.println("Pagado: " + odc4.getPagado() + " de " + odc4.calcPrecio());
    }
}
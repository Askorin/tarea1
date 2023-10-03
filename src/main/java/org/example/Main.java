package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creamos un articulo y lo probamos.
        Articulo art1 = new Articulo(10, "Perro", "Es un perro.", 1500);
        System.out.println(art1);
        System.out.println(art1.getPeso());
        System.out.println(art1.getNombre());
        System.out.println(art1.getDescripcion());
        System.out.println(art1.getPrecio());
        // Segundo artículo.
        Articulo art2 = new Articulo(5, "Gato", "Es un gato.", 2300);

        // Creamos un detalle de orden para probar el artículo.
        DetalleOrden det1 = new DetalleOrden(art1, 5);
        System.out.println(det1);
        System.out.println(det1.calcIVA());
        System.out.println(det1.calcPrecio());
        System.out.println("Precio sin iva detalle 1: " + det1.calcPrecioSinIVA());
        // Segunda detalle de orden.
        DetalleOrden det2 = new DetalleOrden(art2, 8);
        System.out.println("Precio sin iva detalle 2: " + det2.calcPrecioSinIVA());
        // Hacemos un arraylist con los detalles
        ArrayList<DetalleOrden> detalles = new ArrayList<>();
        detalles.add(det1);
        detalles.add(det2);
        // Creamos la orden de compra.
        OrdenCompra odc = new OrdenCompra(new Date(2022, Calendar.JANUARY, 20), "Pagado", detalles);
        System.out.println("Fecha: " + odc.getFecha());
        System.out.println("Precio sin IVA: " + odc.calcPrecioSinIVA());
        System.out.println("IVA: " + odc.calcIVA());
        System.out.println("Precio total: " + odc.calcPrecio());
    }
}
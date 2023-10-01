package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos un articulo y lo probamos.
        Articulo art1 = new Articulo(10, "Perro", "Es un perro.", 1500);
        System.out.println(art1);
        System.out.println(art1.getPeso());
        System.out.println(art1.getNombre());
        System.out.println(art1.getDescripcion());
        System.out.println(art1.getPrecio());

    }
}
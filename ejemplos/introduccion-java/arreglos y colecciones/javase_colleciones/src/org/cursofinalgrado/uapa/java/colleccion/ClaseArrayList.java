package org.cursofinalgrado.uapa.java.colleccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseArrayList {

    public static void main(String[] args) {

        ArrayList<String> libros = new ArrayList<String>();
        libros.add("");
        libros.add("");

        for (int i = 0; i < libros.size(); i++) {
            System.out.println(" Bucle For Tradicional " + libros.get(i));

        }

        for (String string : libros) {
            System.out.println("Bucle For Mejorado " + string);

        }

        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(1);
        enteros.add(15);
        enteros.add(32);

        for (Iterator<Integer> it = enteros.iterator(); it.hasNext();) {
            Integer integer = it.next();

            System.out.println(" Iterator: " + integer);

        }

        ArrayList<Product> productos = new ArrayList<Product>();

        Product p = new Product();
        p.setCode("LB15");
        p.setDescripcion("Set Herramienta");
        p.setPrecio(70.98);

        Product p1 = new Product();
        p1.setCode("TI10");
        p1.setDescripcion("Taladro");
        p1.setPrecio(1070.96);

        productos.add(p);
        productos.add(p1);

        for (Product product : productos) {
            System.out.println(product.getCode());
        }

        List list1 = new ArrayList();

    }
}

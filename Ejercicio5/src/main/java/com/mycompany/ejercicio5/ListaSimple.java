
package com.mycompany.ejercicio5;

public class ListaSimple {
    NodoPrecio cabeza;

    public void agregar(int precio) {
        NodoPrecio nuevo = new NodoPrecio(precio);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoPrecio actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarMayorYMenor() {
        if (cabeza == null) return;

        int min = cabeza.precio;
        int max = cabeza.precio;

        NodoPrecio actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.precio < min) min = actual.precio;
            if (actual.precio > max) max = actual.precio;
            actual = actual.siguiente;
        }

        System.out.println("El menor precio es: " + min);
        System.out.println("El mayor precio es: " + max);
    }
}

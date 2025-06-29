
package com.mycompany.ejercicio3;

public class ListaSimple {
    NodoNota cabeza;

    public void agregar(String asignatura, double nota) {
        NodoNota nuevo = new NodoNota(asignatura, nota);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoNota actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarNotas() {
        NodoNota actual = cabeza;
        while (actual != null) {
            System.out.println("En " + actual.asignatura + " has sacado " + actual.nota);
            actual = actual.siguiente;
        }
    }
}

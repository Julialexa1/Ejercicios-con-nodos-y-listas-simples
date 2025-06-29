
package com.mycompany.ejercicio1;

public class ListaSimple {
    NodoAsignatura cabeza;

    public void agregar(String asignatura) {
        NodoAsignatura nuevo = new NodoAsignatura(asignatura);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoAsignatura actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarAsignaturas() {
        NodoAsignatura actual = cabeza;
        while (actual != null) {
            System.out.println("yo estudio "+actual.asignatura);
            actual = actual.siguiente;
        }
    }
}


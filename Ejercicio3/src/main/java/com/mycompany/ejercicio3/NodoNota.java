
package com.mycompany.ejercicio3;

public class NodoNota {
    String asignatura;
    double nota;
    NodoNota siguiente;

    public NodoNota(String asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.siguiente = null;
    }
}


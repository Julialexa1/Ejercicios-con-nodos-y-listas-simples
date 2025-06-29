
package com.mycompany.ejercicio4;

public class ListaSimple {
    NodoNumero cabeza;

    public void agregar(int valor) {
        NodoNumero nuevo = new NodoNumero(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoNumero actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarInverso() {
        mostrarInversoRecursivo(cabeza);
    }

    private void mostrarInversoRecursivo(NodoNumero nodo) {
        if (nodo == null) return;
        mostrarInversoRecursivo(nodo.siguiente);
        System.out.print(nodo.valor);
        if (nodo != cabeza) System.out.print(", ");
    }
}

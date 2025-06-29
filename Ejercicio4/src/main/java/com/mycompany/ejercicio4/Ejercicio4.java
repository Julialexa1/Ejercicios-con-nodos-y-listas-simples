
//Escribir un programa que almacene en una lista los números del 1 al 10
//y los muestre por pantalla en orden inverso separados por comas.
package com.mycompany.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        for (int i = 1; i <= 10; i++) {
            lista.agregar(i);
        }
        lista.mostrarInverso();
    }
}


package com.mycompany.ejercicio1;

//Mostrar asignaturas

public class Ejercicio1 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Lengua");

        System.out.println("Asignaturas del curso:");
        lista.mostrarAsignaturas();
    }
}


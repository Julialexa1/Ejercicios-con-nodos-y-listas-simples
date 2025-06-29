//Escribir un programa que almacene en una lista los siguientes precios, 50, 75, 46, 22, 80, 65, 8, 
//y muestre por pantalla el menor y el mayor de los precios.

package com.mycompany.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        int[] precios = {50, 75, 46, 22, 80, 65, 8};

        for (int precio : precios) {
            lista.agregar(precio);
        }

        lista.mostrarMayorYMenor();
    }
}

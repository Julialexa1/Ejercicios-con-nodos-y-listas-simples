//Escribir un programa que almacene las asignaturas de un curso 
//(por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, 
//pregunte al usuario la nota que ha sacado en cada asignatura, 
//y después las muestre por pantalla con el mensaje: 
//En <asignatura> has sacado <nota> donde <asignatura> es cada una des las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas por el usuario.

package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();

        String[] materias = {"Matemáticas", "Física", "Química", "Historia", "Lengua"};

        for (String materia : materias) {
            System.out.print("Introduce la nota de " + materia + ": ");
            double nota = sc.nextDouble();
            lista.agregar(materia, nota);
        }

        lista.mostrarNotas();
    }
}

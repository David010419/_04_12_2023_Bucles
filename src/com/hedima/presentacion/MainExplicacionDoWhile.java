package com.hedima.presentacion;

import java.util.Scanner;

public class MainExplicacionDoWhile {
    public static void main(String[] args) {
//        int i = 15;
//        while (i <5){
//            System.out.println("Entra al bucle");
//            i++;
//        }
//        System.out.println("Este mensaje se muestra al terminar el bucle");

//        int i = 15;
//        do{
//            System.out.println("Entra al bucle");
//            i++;
//        }while (i <3);
//        System.out.println("Este mensaje se muestra al terminar el bucle");

//        Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

        Scanner sc1 = new Scanner (System.in);
        int numero = 0;
        int suma = 0;
        do{
            System.out.println("Escribe un número");
            numero = sc1.nextInt();
            suma+=numero;
        }while (numero != 0);
        System.out.println("Este número no está permitido");

        System.out.println("La suma de todos los números introducidos: " + suma);
    }
}

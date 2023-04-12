package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class ProbarArrays {
    public static void main(String[] args) {
        //1. Definir Array
//        int[] numeros = new int[4];
//        numeros[0] = 5;
//        numeros[1] = 4;
//        numeros[2] = 3;
//        numeros[3] = 2;
//        System.out.println("Elemento de la primera celda " + numeros[0]);
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Elemento de la posición " + i + " tiene el valor " + numeros[i]);
//        }
//        Scanner scanner = new Scanner(System.in);
//        String[] letras = new String[5];
//        letras[0] = "";
//        letras[1] = "";
//        letras[2] = "";
//        letras[3] = "";
//        letras[4] = "";
//        for (int i = 0; i < 5; i++);
//        System.out.println("Escribe una letra para almacenar ");
//        scanner.next();
//        if (scanner.hasNext()) {
//            System.out.println("Escribe 5 letras para almacenar");
//            scanner.next();
//        }else if (scanner.hasNext()) {
//            System.out.println("Escribe otra letra para almacenar");
//
//        }else if (scanner.hasNext()) {
//            System.out.println("Escribe otra letra para almacenar");
//            scanner.next();
//        }

//        Scanner s1 = new Scanner(System.in);
//        String[] elementos = new String[5];
//        for (int i=0; i<elementos.length; i++) {
//            System.out.println("Introduzca el elemento: " +(i+1));
//            elementos[i] = s1.next();
//        }
//        System.out.println(Arrays.toString(elementos));

//        Declarar un array con 5 posiciones y asignarle valor a cada una. Recorrer el array para obtener el número mayor guardado

//        int[] numeros = new int[5];
//        numeros[0] = 5;
//        numeros[1] = 4;
//        numeros[2] = 3;
//        numeros[3] = 2;
//        numeros[4] = 10;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Elemento de la posición " + i + " tiene el valor " + numeros[i]);
//            System.out.println("El número más alto es el: " + numeros.);


//        int[] numeros = {15, 10, 21, 8, 33};
//
//                int maximo = numeros[0];
//
//                for(int i = 1; i < numeros.length; i++) {
//                    if(numeros[i] > maximo) {
//                        maximo = numeros[i];
//                    }
//
//                }
//
//                System.out.println("El número más alto del array es: " + maximo);


        //OTRA OPCIÓN DE HACER EL EJERCICIO.
//        int[] numeros = {15, 10, 21, 8, 33};
//
//        int maximo = Integer.MAX_VALUE;
//
//        for(int i = 0; i < numeros.length; i++) {
//            if(numeros[i] > maximo) {
//                maximo = numeros[i];
//            }
//
//        }
//
//        System.out.println("El número más alto del array es: " + maximo);


//        Definir un array de floats asignando valores, como resultado hay que obtener la suma de los valores almacenados en el array
//        float[] floats = {10.4f, 19.3f, 20.4f, 23.5f, 29.7f};
//
//        float suma = 0;
//
//        for (int i = 0; i < floats.length; i++) {
//            suma += floats[i];
//        }
//        System.out.println("La suma del array es:" + suma);
//
//
////        Crear un bucle que pinte por consola todas las componentes de un array en orden inverso a como están guardadas en el array
//
//        int[] array = {10, 19, 22, 23, 29, 30};
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }


//        Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres.
//        El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.

        char[] vocales = {'a', 'b', 'i', 'o', 'u', 'r', 'j', 'e', 't', 's', 'p', 'k', 'x'};
        for (int i = 0; i < vocales.length; i++) {
            if (vocales[i] == 'a' || vocales[i] == 'e' || vocales[i] == 'i' || vocales[i] == 'o' || vocales[i] == 'u'){
                System.out.println(vocales[i] + " : Es una vocal");
            }else {
                System.out.println(vocales[i] + " : Es una consonante");

            }
        }




    }
}
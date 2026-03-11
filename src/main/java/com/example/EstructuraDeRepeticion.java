package com.example;

public class EstructuraDeRepeticion {
    // Ejemplo de while
    public static void ejemploWhile() {
        int contador = 1;

        System.out.println("Ejemplo while:");
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    // Ejemplo de do-while
    public static void ejemploDoWhile() {
        int numero = 1;

        System.out.println("\nEjemplo do-while:");
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }

    // Ejemplo de for clásico
    public static void ejemploForClasico() {
        System.out.println("\nEjemplo for clásico:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    // Ejemplo de for anidado
    public static void ejemploForAnidado() {
        System.out.println("\nEjemplo for anidado:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

    // Ejemplo de break y continue
    public static void ejemploBreakContinue() {

        System.out.println("\nEjemplo break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Número: " + i);
        }

        System.out.println("\nEjemplo continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Número: " + i);
        }
    }

    // Ejemplo de etiquetas (label)
    public static void ejemploEtiquetas() {

        System.out.println("\nEjemplo etiquetas:");

        externo:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break externo;
                }

                System.out.println("i=" + i + " j=" + j);
            }

        }
    }
}
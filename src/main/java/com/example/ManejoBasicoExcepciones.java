package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ManejoBasicoExcepciones {

    /**
     * Captura el error de dividir por cero.
     */
    public static int ejemploTryCatchDivision(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            // Se ejecuta si b es 0
            return 0; 
        }
    }

    /**
     * Maneja el error cuando el usuario ingresa texto en lugar de un número.
     */
    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        try {
            int numero = sc.nextInt();
        } catch (InputMismatchException e) {
            // Se ejecuta si el usuario escribe "hola" en vez de un número
            sc.nextLine(); // Limpiar el buffer
        }
    }

    /**
     * El bloque finally siempre se ejecuta, ocurra o no el error.
     */
    public static void ejemploBloqueFinally() {
        try {
            // Código que podría fallar
        } catch (Exception e) {
            // Manejo del error
        } finally {
            // Ideal para cerrar recursos como archivos o bases de datos
        }
    }

    /**
     * Uso de un bucle para obligar al usuario a dar una entrada válida
     * sin que el programa se cierre por un error.
     */
    public static int evitarCierrePrograma() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = sc.nextInt();
                entradaValida = true; // Si llega aquí, no hubo error
            } catch (InputMismatchException e) {
                sc.nextLine(); // Limpiar el error del buffer
            }
        }
        return numero;
    }
}
package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un entero: ");
        int numeroEntero = sc.nextInt();

        System.out.print("Ingrese un decimal: ");
        double numeroDecimal = sc.nextDouble();

        sc.nextLine(); // limpiar salto pendiente

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();

        sc.nextLine(); // limpiar salto pendiente

        System.out.print("Ingrese una línea completa: ");
        String lineaCompleta = sc.nextLine();

        System.out.println("\nResultados:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea completa: " + lineaCompleta);
    }

    @SuppressWarnings("resource")
    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        sc.nextLine(); // solución al problema

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Número: " + numero);
        System.out.println("Nombre: " + nombre);
    }
}
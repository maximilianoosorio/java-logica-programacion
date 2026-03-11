package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {
     // 1️⃣ Try-Catch división
    public static void ejemploTryCatchDivision() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    // 2️⃣ Try-Catch con Scanner
    public static void ejemploTryCatchInput() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        }
    }

    // 3️⃣ Bloque finally
    public static void ejemploBloqueFinally() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            System.out.println("Número: " + numero);
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
        } finally {
            System.out.println("Este bloque siempre se ejecuta.");
            sc.close();
        }
    }

    // 4️⃣ Evitar que el programa se cierre
    public static void evitarCierrePrograma() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese un número entero: ");
                int numero = sc.nextInt();
                System.out.println("Número válido: " + numero);
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                sc.nextLine(); // limpiar buffer
            }
        }

        sc.close();
    }
}
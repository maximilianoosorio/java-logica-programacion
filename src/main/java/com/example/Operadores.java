package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {
        int a = 10;
        int b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int numero = 5;

        System.out.println("Prefijo ++: " + (++numero));
        System.out.println("Sufijo ++: " + (numero++));
        System.out.println("Valor final: " + numero);
    }

    public static void demostrarRelacionales() {
        int a = 5;
        int b = 10;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    public static void demostrarLogicos() {
        boolean condicion1 = true;
        boolean condicion2 = false;

        System.out.println("AND (&&): " + (condicion1 && condicion2));
        System.out.println("OR (||): " + (condicion1 || condicion2));
        System.out.println("NOT (!): " + (!condicion1));
    }

    public static void demostrarAsignacionCompuesta() {
        int numero = 10;

        numero += 5;
        System.out.println("+= : " + numero);

        numero *= 2;
        System.out.println("*= : " + numero);
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;

        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(resultado);
    }
}
package com.example;

public class MetodosEstaticosSimples {

    // Método sin parámetros y sin retorno
    public static void ejemploMetodoSinParametros() {
        System.out.println("Este es un método sin parámetros y sin retorno.");
    }

    // Método que recibe parámetros
    public static void ejemploMetodoConParametros(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método con retorno
    public static int ejemploMetodoConRetorno(int a, int b) {
        int suma = a + b;
        return suma;
    }

    // Método sobrecargado (mismo nombre, diferentes parámetros)
    public static int ejemploSobrecargaMetodo(int a, int b) {
        return a + b;
    }

    public static double ejemploSobrecargaMetodo(double a, double b) {
        return a + b;
    }
}
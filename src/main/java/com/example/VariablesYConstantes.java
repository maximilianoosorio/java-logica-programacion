package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion() {
        int edad = 17; 
        String nombre = "Programador";
        boolean esEstudiante = true;
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Estudiante: " + esEstudiante);
    }

    public static void demostrarConvencionesNombres() {
        // Ejemplo de camelCase
        int velocidadMaxima = 100;
        String nombreDeUsuario = "Admin";
        System.out.println("Usando camelCase: velocidadMaxima, nombreDeUsuario");
    }

    public static void demostrarConstantes() {
        final double PI = 3.14159;
        final int SEGUNDOS_POR_MINUTO = 60;
        System.out.println("Constante PI: " + PI);
    }
}
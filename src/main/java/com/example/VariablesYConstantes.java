package com.example;

public class VariablesYConstantes {

    
    public static void demostrarDeclaracionAsignacion() {
        int edad = 19;
        double altura = 1.57;
        String nombre = "Jennedyth";
        char letra = 'P';
        boolean activo = true;

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nombre: " + nombre);
        System.out.println("Letra: " + letra);
        System.out.println("Activo: " + activo);
    }


    public static void demostrarConvencionesNombres() {
        String nombreCompleto = "Jennedyth Perez";
        int numeroDeTelefono = 1234567890;
        double salarioMensual = 20000.6;

        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Número de teléfono: " + numeroDeTelefono);
        System.out.println("Salario mensual: " + salarioMensual);
    }

   
    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final String PAIS = "venezuela";

        System.out.println("Valor de PI: " + PI);
        System.out.println("País: " + PAIS);
    }
}
package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito(){
    /**
     * Ejemplo de Widening Conversion (automática).
     * El compilador pasa de un tipo menor a uno mayor sin riesgo.
     */
        int miEntero = 100;
        double miDouble = miEntero; // Casting automático
        
    }

    /**
     * Ejemplo de Narrowing Conversion (manual).
     * Se requiere el operador (tipo) porque puede haber pérdida de información.
     */
    public static void demostrarCastingExplicito() {
        double miDouble = 9.99d;
        int miEntero = (int) miDouble; // Casting manual: el resultado será 9
    }

    /**
     * Muestra pérdida de precisión al convertir tipos con rangos distintos.
     */
    public static void demostrarProblemasDePrecision() {
        // El rango de un byte es de -128 a 127.
        // Al intentar meter 130, ocurrirá un desbordamiento (overflow).
        int numeroGrande = 130;
        byte resultado = (byte) numeroGrande; 
        System.out.println(resultado); // Retornará -126 debido al desbordamiento circular
    }
}

package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicito(){
        int numeroInt = 100;
        double numDouble = numeroInt;

        System.out.println("int: " + numeroInt);
        System.out.println("double: " + numDouble);
    }
    public static void demostrarCastingExplicito(){
        double numeDouble = 9.99;
        int numInt = (int) numeDouble;

        System.out.println("double:" + numeDouble);
        System.out.println("int convertido " + numInt);

    }
    public static void demostrarProblemaDePrecision(){
        double valorDouble = 7.89;
        int valorInt = (int) valorDouble;

        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor convertido (int): " + valorInt);
        System.out.println("Se pierden los decimales al convertir ");

    }
}
package com.example;

public class Operadores {
    
    public static void demostrarAritmeticos(){

        int a = 9;
        int b = 12;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int residuo = a % b;
    }

    public static void demostrarIncrementoDecremento(){

        int a = 9;
        int b = 12;
        a++;
        b--;
    }

    public static void demostrarRelacionales(){
        int a = 9;
        int b = 12;
        boolean mayor = a > b;
        boolean menor = a < b;
        boolean igual = a == b;
    }

    public static void demostrarLogicos(){
        boolean mascota = true;
        boolean perro = false;
        boolean and = mascota && perro;
        boolean or = mascota || perro;
        boolean not = !mascota;
    }

    public static void demostrarAsignacionCompuesta(){
        int a = 9;
        a += 3;
        a -= 2;
        a *= 4;
        a /= 2;
        a %= 5;
    }
    public static void demostrarOperadorTernario(){
        int a = 9;
        int b = 12;
        int max = (a > b) ? a : b;
        
    }
}

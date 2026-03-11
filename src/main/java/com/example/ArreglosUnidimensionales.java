package com.example;

public class ArreglosUnidimensionales {

    // Demuestra diferentes formas de declarar, crear e inicializar un array
    public static void declararCrearInicializar() {

        // Declaración
        int[] numeros;

        // Creación
        numeros = new int[3];

        // Inicialización
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Declarar y crear al mismo tiempo
        int[] edades = new int[3];

        // Declarar, crear e inicializar en una sola línea
        String[] nombres = {"Ana", "Luis", "Carlos"};

        System.out.println("Array numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nArray nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    // Usa length para obtener el tamaño del array
    public static void mostrarLongitud() {

        int[] numeros = {5, 10, 15, 20};

        System.out.println("La longitud del array es: " + numeros.length);
    }

    // Recorre un array usando un for clásico
    public static void recorrerConForClasico() {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Recorrido con for clásico:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    // Recorre un array usando for-each
    public static void recorrerConForEach() {

        String[] frutas = {"Manzana", "Banana", "Naranja"};

        System.out.println("Recorrido con for-each:");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    // Método que acepta un array como parámetro y retorna un array
    public static int[] arrayComoParametroYRetorno(int[] numeros) {

        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[i] * 2;
        }

        return resultado;
    }
}
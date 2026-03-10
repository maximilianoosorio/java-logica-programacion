package com.example;

public class ArreglosUnidimensionales {

    /**
     * Diferentes formas de preparar un array para su uso.
     */
    public static void declararCrearInicializar() {
        // Forma 1: Declarar y luego crear con tamaño (valores por defecto: 0)
        int[] miArray1;
        miArray1 = new int[3];
        miArray1[0] = 10;

        // Forma 2: Declarar y crear en una sola línea
        double[] miArray2 = new double[5];

        // Forma 3: Inicialización directa (literal)
        String[] nombres = {"Ana", "Juan", "Pedro"};
    }

    /**
     * El atributo .length devuelve la cantidad de elementos.
     */
    public static int mostrarLongitud() {
        int[] datos = {1, 2, 3, 4, 5, 6, 7};
        return datos.length; // Retorna 7
    }

    /**
     * Uso del for con índice para tener control total de la posición.
     */
    public static void recorrerConForClasico() {
        int[] numeros = {10, 20, 30, 40};
        for (int i = 0; i < numeros.length; i++) {
            // Se accede mediante el índice: numeros[i]
            numeros[i] = numeros[i] + 1; 
        }
    }

    /**
     * Uso de for-each: más limpio, pero no permite modificar 
     * los valores originales ni usar el índice.
     */
    public static  void recorrerConForEach() {
        String[] frutas = {"Manzana", "Pera", "Uva"};
        for (String fruta : frutas) {
            // "fruta" representa el elemento actual en cada vuelta
        }
    }

    /**
     * Demuestra cómo pasar y devolver estructuras completas.
     */
    public static int sumarElementos(int[] arrayEntrada) {
        int suma = 0;
        for (int num : arrayEntrada) {
            suma += num;
        }
        return suma;
    }

    public static int[] generarArrayPares(int cantidad) {
        int[] resultado = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = i * 2;
        }
        return resultado;
    }
}
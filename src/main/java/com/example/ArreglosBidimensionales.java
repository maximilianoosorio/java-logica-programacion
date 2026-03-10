package com.example;

public class ArreglosBidimensionales {

    /**
     * Diferentes formas de declarar e inicializar matrices.
     */
    public static void declararCrearMatrices() {
        // Forma 1: Declarar y crear con tamaño fijo (3 filas, 4 columnas)
        int[][] matriz1 = new int[3][4];

        // Forma 2: Inicialización directa con valores (3x3)
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Forma 3: Matriz irregular (Jagged Array)
        // Las filas pueden tener diferentes tamaños
        int[][] irregular = new int[2][];
        irregular[0] = new int[3];
        irregular[1] = new int[5];
    }

    /**
     * Recorrido estándar usando bucles for anidados.
     */
    public static void recorrerMatriz() {
        int[][] matriz = { {1, 2}, {3, 4}, {5, 6} };

        // matriz.length nos da el número de filas
        for (int i = 0; i < matriz.length; i++) {
            // matriz[i].length nos da el número de columnas de esa fila
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                // Lógica con el valor...
            }
        }
    }

    /**
     * Ejemplo práctico: Sumar todos los elementos de una tabla.
     */
    public static int sumarMatriz(int[][] tabla) {
        int sumaTotal = 0;
        for (int[] fila : tabla) {
            for (int elemento : fila) {
                sumaTotal += elemento;
            }
        }
        return sumaTotal;
    }
}
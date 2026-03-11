package com.example;

public class ArreglosBidimensionales {
    // Declarar y crear matrices
    public static void declararCrearMatrices() {

        // Declaración
        int[][] matriz;

        // Creación
        matriz = new int[2][3];

        // Inicialización
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("Matriz creada manualmente:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recorrer una matriz con bucles anidados
    public static void recorrerMatriz() {

        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("\nRecorrido de la matriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Ejemplo de uso de matrices (tabla simple)
    public static void ejemploUsosTipos() {

        int[][] tablaMultiplicar = new int[3][3];

        for (int i = 0; i < tablaMultiplicar.length; i++) {

            for (int j = 0; j < tablaMultiplicar[i].length; j++) {

                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("\nTabla de multiplicar:");

        for (int i = 0; i < tablaMultiplicar.length; i++) {

            for (int j = 0; j < tablaMultiplicar[i].length; j++) {

                System.out.print(tablaMultiplicar[i][j] + " ");
            }

            System.out.println();
        }
    }
}
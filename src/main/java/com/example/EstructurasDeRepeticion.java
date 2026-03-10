package com.example;

public class EstructurasDeRepeticion {

    /**
     * Bucle while: Se ejecuta mientras la condición sea verdadera.
     * Puede que nunca se ejecute si la condición es falsa desde el inicio.
     */
    public static int ejemploWhile() {
        int contador = 0;
        int suma = 0;
        while (contador < 5) {
            suma += contador;
            contador++;
        }
        return suma;
    }

    /**
     * Bucle do-while: Se ejecuta AL MENOS una vez, 
     * ya que la condición se evalúa al final.
     */
    public static void ejemploDoWhile() {
        int i = 10;
        do {
            // Esto se ejecuta una vez aunque i no sea menor a 5
            i++;
        } while (i < 5);
    }

    /**
     * Bucle for clásico: Ideal cuando sabes exactamente 
     * cuántas veces quieres repetir algo.
     */
    public static int[] ejemploForClasico() {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
        }
        return numeros;
    }

    /**
     * For anidado: Un bucle dentro de otro. 
     * Común para recorrer matrices o tablas.
     */
    public static void ejemploForAnidado() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                // Lógica de matriz (i, j)
            }
        }
    }

    /**
     * break: Sale del bucle inmediatamente.
     * continue: Salta a la siguiente iteración del bucle.
     */
    public static int ejemploBreakContinue() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; // Salta los números pares
            if (i > 7) break;        // Detiene el bucle si i es mayor a 7
            suma += i;
        }
        return suma;
    }

    /**
     * Etiquetas (Labels): Permiten romper un bucle externo 
     * desde uno interno.
     */
    public static void ejemploEtiquetas() {
        bucleExterno: 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break bucleExterno; // Rompe ambos bucles
                }
            }
        }
    }
}
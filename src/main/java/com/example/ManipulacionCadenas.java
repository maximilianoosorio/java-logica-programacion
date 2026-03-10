package com.example;

public class ManipulacionCadenas {

    /**
     * Diferencia entre el operador + y el método concat().
     */ 
    public static void demostrarConcatenacion() {
        String a = "Hola";
        String b = " Mundo";
        
        String resultado1 = a + b; // Más común y versátil
        String resultado2 = a.concat(b); // Solo funciona con Strings
    }

    /**
     * Métodos esenciales para transformar y analizar texto.
     */
    public static void demostrarMetodosUtiles() {
        String texto = "  Java es Genial  ";

        int largo = texto.length();                // 18
        char letra = texto.charAt(2);              // 'J'
        String sub = texto.substring(2, 6);        // "Java"
        String mayus = texto.toUpperCase();        // "  JAVA ES GENIAL  "
        String minus = texto.toLowerCase();        // "  java es genial  "
        String limpio = texto.trim();              // "Java es Genial" (quita espacios inicio/fin)
        
        // Comparaciones y búsquedas
        boolean esIgual = texto.equals("Java");    // false (por los espacios y mayúsculas)
        boolean igNoCase = limpio.equalsIgnoreCase("java es genial"); // true
        boolean contiene = texto.contains("es");   // true
        boolean empieza = limpio.startsWith("J");  // true
        boolean termina = limpio.endsWith("l");    // true
    }

    /**
     * Los Strings en Java son inmutables: no se pueden cambiar, 
     * se crean objetos nuevos en memoria.
     */
    public static void demostrarInmutabilidad() {
        String s1 = "Hola";
        s1.toUpperCase(); // ¡Esto no cambia s1!
        
        // s1 sigue siendo "Hola". Para cambiarlo hay que reasignar:
        s1 = s1.toUpperCase(); // Ahora s1 es "HOLA"
    }

    /**
     * StringBuilder es la opción eficiente para concatenar muchas veces
     * (por ejemplo, dentro de un bucle).
     */
    public static String usarStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista: ");
        for (int i = 0; i < 5; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString(); // Convierte el buffer a un String real
    }
}
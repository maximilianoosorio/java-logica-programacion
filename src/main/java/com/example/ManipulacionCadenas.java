package com.example;

public class ManipulacionCadenas {
    // Ejemplos de concatenación
    public static void demostrarConcatenacion() {

        String nombre = "Michell";
        String apellido = "Roldan";

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Concatenación con + : " + nombreCompleto);

        String saludo = "Hola".concat(" ").concat(nombre);

        System.out.println("Concatenación con concat(): " + saludo);
    }

    // Demuestra métodos útiles de String
    public static void demostrarMetodosUtiles() {

        String texto = "Programacion en Java";

        System.out.println("Longitud: " + texto.length());

        System.out.println("Substring (0-12): " + texto.substring(0, 12));

        System.out.println("Mayúsculas: " + texto.toUpperCase());

        System.out.println("Minúsculas: " + texto.toLowerCase());

        System.out.println("Contiene 'Java': " + texto.contains("Java"));

        System.out.println("Trim ejemplo: " + "   Hola Mundo   ".trim());
    }

    // Comparación de cadenas
    public static void equalsIgnoreCase() {

        String palabra1 = "java";
        String palabra2 = "JAVA";

        boolean resultado = palabra1.equalsIgnoreCase(palabra2);

        System.out.println("¿Las palabras son iguales ignorando mayúsculas?: " + resultado);
    }

    // Demuestra que String es inmutable
    public static void demostrarMutabilidad() {

        String texto = "Hola";

        texto.concat(" Mundo");

        System.out.println("Texto después de concat (sin reasignar): " + texto);

        texto = texto.concat(" Mundo");

        System.out.println("Texto después de reasignar: " + texto);
    }

    // Uso de StringBuilder
    public static void usarStringBuilder() {

        StringBuilder sb = new StringBuilder();

        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        sb.append(" desde StringBuilder");

        System.out.println("Resultado con StringBuilder: " + sb.toString());
    }
}
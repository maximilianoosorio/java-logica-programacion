package com.example;


    public class EstructurasCondicionales {

    /**
     * Estructura if simple.
     */
    public static boolean ejemploIf(int edad) {
        boolean esMayor = false;
        if (edad >= 18) {
            esMayor = true;
        }
        return esMayor;
    }

    /**
     * Estructura if-else.
     */
    public static String ejemploIfElse(double nota) {
        if (nota >= 6.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    /**
     * Cadena if-else if-else.
     */
    public static String ejemploIfElseIfElse(int hora) {
        if (hora >= 6 && hora < 12) {
            return "Buenos días";
        } else if (hora >= 12 && hora < 20) {
            return "Buenas tardes";
        } else {
            return "Buenas noches";
        }
    }

    /**
     * Switch tradicional usando sentencias break.
     */
    public static  String ejemploSwitch(int dia) {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            default:
                nombreDia = "Día no válido";
                break;
        }
        return nombreDia;
    }

    /**
     * Switch Expression (Disponible en Java 14+).
     * Más conciso, usa flechas (->) y no requiere break.
     */
    public static String ejemploSwitchExpression(int mes) {
        return switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes desconocido";
        };
    }
}

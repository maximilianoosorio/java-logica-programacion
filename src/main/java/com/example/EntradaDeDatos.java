package com.example;
import java.util.Scanner;
public class EntradaDeDatos {

    /**
     * Utiliza Scanner para leer distintos tipos de datos.
     * Muestra la diferencia entre leer una palabra (next) y una línea (nextLine).
     */
    public void leerVariosTipos() {

        Scanner sc = new Scanner(System.in);


        System.out.print("Edad (int): ");
        int edad = sc.nextInt();
        
        System.out.print("Precio (double): ");
        double precio = sc.nextDouble();
        
        System.out.print("Nombre (una palabra): ");
        String nombre = sc.next();
        
        sc.nextLine(); // Limpiar el buffer para poder leer la siguiente línea completa
        
        System.out.print("Descripción (línea completa): ");
        String descripcion = sc.nextLine();
    }

    /**
     * Demuestra cómo resolver el problema del salto de línea pendiente al mezclar
     * métodos numéricos (nextInt/nextDouble) con nextLine().
     */
    public void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt(); 
        
        // El problema: nextInt() lee el número pero deja el carácter '\n' (Enter) en el buffer.
        // Si llamamos a nextLine() inmediatamente, esta leerá ese '\n' y se saltará la entrada.
        
        sc.nextLine(); // SOLUCIÓN: "Consumimos" el salto de línea sobrante
        
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = sc.nextLine(); // Ahora sí esperará al usuario
    }
}
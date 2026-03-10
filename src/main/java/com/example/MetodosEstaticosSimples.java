package com.example;

public class MetodosEstaticosSimples {

    /**
     * Un método estático simple sin parámetros ni retorno.
     */
    public static void saludarEstatico() {
        // Al ser void y sin parámetros, solo ejecuta una acción interna.
        // Se llamaría como: MetodosEstaticosSimples.saludarEstatico();
    }

    public void ejemploDeclaracionLlamada() {
        // Llamada interna (dentro de la misma clase)
        saludarEstatico(); 
    }

    /**
     * Un método estático que acepta parámetros.
     */
    public static void imprimirSuma(int a, int b) {
        int resultado = a + b;
        // Procesa la información recibida
    }

    public void ejemploPasoParametros() {
        imprimirSuma(5, 10);
    }

    /**
     * Un método estático que retorna un valor.
     */
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    public void ejemploRetornoValores() {
        int resultado = calcularCuadrado(4); // resultado valdrá 16
    }

    /**
     * Sobrecarga (Overloading): Métodos con el mismo nombre pero 
     * diferente lista de parámetros (en tipo o cantidad).
     */
    public static double area(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double area(double base, double altura) {
        return (base * altura) / 2;
    }

    public void ejemploSobrecarga() {
        double circulo = area(5.0);        // Llama al primer método
        double triangulo = area(10.0, 5.0); // Llama al segundo método
    }
}
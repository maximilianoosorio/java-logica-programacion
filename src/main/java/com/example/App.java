package com.example;

/**
 * Clase Principal: Ejecuta y demuestra todas las funcionalidades 
 * implementadas en los diferentes módulos del proyecto.
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("==============================================");
        System.out.println("   FUNDAMENTOS DE PROGRAMACIÓN EN JAVA       ");
        System.out.println("==============================================\n");

        // --- Tema: Variables y Constantes ---
        System.out.println("--- Tema: Variables y Constantes ---");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();
        System.out.println();

        // --- Tema: Tipos de Datos Primitivos ---
        System.out.println("--- Tema: Tipos de Datos Primitivos ---");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        System.out.println();

        // --- Tema: Conversión de Tipos (Casting) ---
        System.out.println("--- Tema: Conversión de Tipos ---");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();
        System.out.println();

        // --- Tema: Operadores ---
        System.out.println("--- Tema: Operadores ---");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarRelacionales();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarLogicos();
        Operadores.demostrarOperadorTernario();
        System.out.println();

        // --- Tema: Entrada de Datos ---
        // Nota: Este se deja comentado o al final para no interrumpir el flujo automático
        // System.out.println("--- Tema: Entrada de Datos ---");
        // EntradaDeDatos.leerVariosTipos();
        // System.out.println();

        // --- Tema: Estructuras Condicionales ---
        System.out.println("--- Tema: Estructuras Condicionales ---");
        EstructurasCondicionales.ejemploIf(20);
        EstructurasCondicionales.ejemploIfElse(8.5);
        EstructurasCondicionales.ejemploIfElseIfElse(14);
        EstructurasCondicionales.ejemploSwitch(2);
        EstructurasCondicionales.ejemploSwitchExpression(5);
        System.out.println();

        // --- Tema: Estructuras de Repetición ---
        System.out.println("--- Tema: Estructuras de Repetición ---");
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        EstructurasDeRepeticion.ejemploEtiquetas();
        System.out.println();

        // --- Tema: Arreglos Unidimensionales ---
        System.out.println("--- Tema: Arreglos Unidimensionales ---");
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        ArreglosUnidimensionales.sumarElementos(new int[]{1, 2, 3, 4, 5});
        ArreglosUnidimensionales.generarArrayPares(5);
        System.out.println();

        // --- Tema: Arreglos Bidimensionales ---
        System.out.println("--- Tema: Arreglos Bidimensionales ---");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.sumarMatriz(new int[][]{{1, 2}, {3, 4}});
        System.out.println();

        // --- Tema: Manipulación de Cadenas ---
        System.out.println("--- Tema: Manipulación de Cadenas ---");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.demostrarInmutabilidad();
        ManipulacionCadenas.usarStringBuilder();
        System.out.println();

        // --- Tema: Manejo de Excepciones ---
        System.out.println("--- Tema: Manejo de Excepciones ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision(10, 0);
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();
        System.out.println();

        System.out.println("==============================================");
        System.out.println("   EJECUCIÓN FINALIZADA CON ÉXITO            ");
        System.out.println("==============================================");
    }
}
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== VARIABLES Y CONSTANTES =====");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();


        System.out.println("\n===== TIPOS DE DATOS PRIMITIVOS =====");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracter();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();


        System.out.println("\n===== CONVERSIÓN DE TIPOS =====");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemaDePrecision();


        System.out.println("\n===== OPERADORES =====");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadorTernario();


        System.out.println("\n===== ENTRADA DE DATOS =====");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();


        System.out.println("\n===== CONDICIONALES =====");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpression();


        System.out.println("\n===== BUCLES =====");
        EstructuraDeRepeticion.ejemploWhile();
        EstructuraDeRepeticion.ejemploDoWhile();
        EstructuraDeRepeticion.ejemploForClasico();
        EstructuraDeRepeticion.ejemploForAnidado();
        EstructuraDeRepeticion.ejemploBreakContinue();
        EstructuraDeRepeticion.ejemploEtiquetas();



        System.out.println("\n===== MÉTODOS =====");
        MetodosEstaticosSimples.ejemploMetodoSinParametros();
        MetodosEstaticosSimples.ejemploMetodoConParametros("Michell", 20);

        int suma = MetodosEstaticosSimples.ejemploMetodoConRetorno(5, 7);
        System.out.println("Resultado: " + suma);


        System.out.println("\n===== ARREGLOS UNIDIMENSIONALES =====");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();

        int[] datos = {2,4,6};
        int[] resultado = ArreglosUnidimensionales.arrayComoParametroYRetorno(datos);

        for(int n : resultado){
            System.out.println(n);
        }


        System.out.println("\n===== ARREGLOS BIDIMENSIONALES =====");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipos();


        System.out.println("\n===== CADENAS =====");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.equalsIgnoreCase();
        ManipulacionCadenas.demostrarMutabilidad();
        ManipulacionCadenas.usarStringBuilder();


        System.out.println("\n===== EXCEPCIONES =====");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();

        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
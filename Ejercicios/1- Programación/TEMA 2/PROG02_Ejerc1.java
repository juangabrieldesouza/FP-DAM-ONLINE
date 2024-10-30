
package com.cursodejava.prog02_ejerc1;

/**
 * JUAN GABRIEL DE SOUZA
 * DESAROLLO DE APLICACIONES MULTIPLATAFORMAS
 * PROG02 EJERC1
 * 10/29/2024
 */


public class PROG02_Ejerc1 {
    
    
    public static void main(String[] args) {
        
        final short VALOR_NO_MODIFICABLE = 1000; // guardamos en una const pues asi no será modificable
        
        boolean carnet = false; //si el estudiante tiene o no carnet lo guardamos en un boolean PARA TRUE O FALSE
        String resultadoCarnet = (carnet == false) ? "No es habilitado para conducir" : "Es habilitado para conducir";
        // utilizando el operador ternario para
        
        String[] meses = {"","Enero", "Febrero", "Marzo", 
            "Abril", "Mayo", "Junio", "Julio", "Agosto", 
            "Septiembre", "Octubre", "Noviembre", "Diciembre"}; /* representados numericamente 
        y en cadena */
        
        String nombre = "Juan Gabriel"; 
        
        String apellidos = "de Souza"; /* nombre y apellidos en String para guardar
         la série de caracteres*/ 
       
        
        char sexo = 'H'; // aqui podriamos asignar cual es el sexo, si es hombre o mujer
        
        char resultadoSexo = (sexo == 'H') ? 'H' : 'M'; /* aqui utilizamos dos variables, una para
        verificar el sexo atraves del operador ternário y otra para exibir el resultado de la operación*/
        
        
        
        /* yo no sé como hacer para descobrir milisegundos transcurrido hasta hoy, sé que utilizariamos en tipo
        primitivo long para esto, así que, el seguiente código tuve una mano de chatgtp para hacerlo */
        
        
        // Fecha de inicio: 01/01/1980
        long fechaInicio = 315532800000L; // Milisegundos desde 01/01/1970 hasta 01/01/1980
        
        // Obtener la fecha y hora actual en milisegundos
        long fechaActual = System.currentTimeMillis();

        // Calcular los milisegundos transcurridos desde 01/01/1980
        long milisegundosTranscurridos = fechaActual - fechaInicio;

        /* Lo que yo he entendido es que básicamente chat gtp cogió los milisegundos
        de la fecha actual y lo resto con la fecha especifica dada por la actividad
        
        exibiriamos la variable long "milisegundosTranscurridos"
        */
        
        double cuentaBancaria = 1122.35; /*Utilizamos double para exibir números
        con casas decimales, o sea, números racionales
        */
        
        int distanciaTierraMarte = 54600000;
         
        System.out.print(VALOR_NO_MODIFICABLE + "\n");
        System.out.print("El estudiante " + resultadoCarnet +"\n");
        System.out.print("Meses del año: " + meses[1] + ", " + meses[2] + ", " + meses[3] + ", " + 
                         meses[4] + ", " + meses[5] + ", " + meses[6] + ", " + 
                         meses[7] + ", " + meses[8] + ", " + meses[9] + ", " + 
                         meses[10] + ", " + meses[11] + ", " + meses[12] + "\n");
        System.out.print("Nombre: " + nombre + "\n");
        System.out.print("Apellidos: " + apellidos+"\n");
        System.out.print("Sexo: " + resultadoSexo + "\n");
        System.out.print(milisegundosTranscurridos + " milisegundos transcurridos de 1980 hasta hoy" + "\n");
        System.out.print("Saldo: " + cuentaBancaria + "\n");
        System.out.print(distanciaTierraMarte + " de km la distancia de la Tierra hacia Marte" + "\n");
        
        
    }
}

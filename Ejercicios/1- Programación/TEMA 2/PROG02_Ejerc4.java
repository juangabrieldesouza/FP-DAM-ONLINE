
package com.cursodejava.prog02_ejerc1;

import java.util.*;


/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc4 
*/




public class PROG02_Ejerc4 {
    
    public static void main (String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        byte edadJubilacion = entrada.nextByte();
        String jubilacion = (edadJubilacion >= 65) ? "Esta en la edad de Jubilacion" : "No esta en la Edad de Jubilacion";
        System.out.println(jubilacion);
        
    }
}


package com.cursodejava.prog02_ejerc1;
import java.text.DecimalFormat;
import java.util.*;
/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc5
29/10/2024
*/

public class PROG02_Ejerc5 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la quantidad de segundos: ");
        double segundos = entrada.nextDouble();
        
        double minutos = segundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Los segundos que has introducido en:");
        System.out.println("Minutos: "+ df.format(minutos));
        System.out.println("Horas: "+ df.format(horas));
        System.out.println("Dias: "+ df.format(dias));
    }
}


package com.cursodejava.prog02_ejerc1;
import java.util.Scanner;
/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc7
30/10/2024
*/


public class PROG02_Ejerc9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduce un año: ");
        int año = entrada.nextInt();

        
        boolean esBisiesto = (año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0));

        
        System.out.println("¿El año " + año + " es bisiesto? " + (esBisiesto ? "Sí" : "No"));
        
        entrada.close();
    }
}

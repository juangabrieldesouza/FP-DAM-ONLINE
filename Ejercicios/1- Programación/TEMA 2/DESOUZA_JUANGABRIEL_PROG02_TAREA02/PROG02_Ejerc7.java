
package com.cursodejava.prog02_ejerc1;
import java.util.*;
/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc7
29/10/2024
*/
public class PROG02_Ejerc7 {
    public static void main (String[] args) {
        double c1, c2, c3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Indroduzca el valor de a: ");
        c1 = entrada.nextDouble();
        System.out.print("Indroduzca el valor de b: ");
        c2 = entrada.nextDouble();
        System.out.print("Indroduzca el valor de c: ");
        c3 = entrada.nextDouble();
        
        
        if (c1 != 0) {
            double x = -(c2 * c3) / c1;

            
            System.out.printf("El valor de x es: %.2f\n", x);
        }
        else {
            System.out.println("La ecuación no es válida <a> no puede ser cero.");
            
        }
    }
}

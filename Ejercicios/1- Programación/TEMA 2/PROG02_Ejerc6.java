
package com.cursodejava.prog02_ejerc1;

/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc6
29/10/2024
*/


public class PROG02_Ejerc6 {
    
    public enum razasPerro {Mastin, Terrier, Samoyedo, Pekines, Husky, Galgo};
    public static void main (String[] args) {
        
         razasPerro var1 = razasPerro.Terrier;
        razasPerro var2 = razasPerro.Husky;

        
        System.out.println("var1 es igual a var2? " + var1.equals(var2)); //comparacion

        
        System.out.println("Posicion de var1 en el enumerado: " + var1.ordinal()); //posicion
        System.out.println("Posicion de var2 en el enumerado: " + var2.ordinal());

        
        System.out.println("Cantidad de valores en el enumerado: " + razasPerro.values().length); //
        
        
    }
    
    
    
}


package com.cursodejava.prog02_ejerc1;
import java.util.*;
/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc7
29/10/2024
*/
public class PROG02_Ejerc8 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double alumnosProg, alumnosEntorDesar, alumnosBD;
        
        System.out.print("Digite la quantidade de Alumnos matriculados en Programacion: ");
        alumnosProg = entrada.nextDouble();
        System.out.print("Digite la quantidade de Alumnos matriculados en Programacion: ");
        alumnosEntorDesar = entrada.nextDouble();
        System.out.print("Digite la quantidade de Alumnos matriculados en Programacion: ");
        alumnosBD = entrada.nextDouble();
        
        double totalAlumnos = alumnosProg + alumnosEntorDesar + alumnosBD;
        
        double porcenProg = alumnosProg / totalAlumnos * 100;
        double porcenEntorDesar = alumnosEntorDesar / totalAlumnos * 100;
        double porcenBD = alumnosBD / totalAlumnos * 100;
        
        System.out.printf("Porcentaje de alumnos en Programacion: %.2f%%\n", porcenProg);
        System.out.printf("Porcentaje de alumnos en Entornos de Desarrollo: %.2f%%\n", porcenEntorDesar);
        System.out.printf("Porcentaje de alumnos en Base de Datos: %.2f%%\n", porcenBD);
        entrada.close();
    }
}

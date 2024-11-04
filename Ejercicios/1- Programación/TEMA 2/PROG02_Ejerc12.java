package com.cursodejava.prog02_ejerc1;
/*
JUAN GABRIEL DE SOUZA
DAM                             <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
PROG2_Ejerc7
30/10/2024
*/
public class PROG02_Ejerc12 {
     public static void main(String[] args) {

        
        System.out.println("------- Conversiones entre enteros y coma flotante -------");

    
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = (int)(i * x); 
        double dx = 2.0;
        double dz = dx * y;

     
        System.out.println("Producto de int por float: j= i*x = " + j);
        System.out.println("Producto de float por double: dz=dx * y = " + dz);

       
        System.out.println("\n------- Operaciones con byte -------");

    
        byte bx = -128;
        byte by = 1;
        byte bz = (byte)(bx - by); 
        int j2 = bx - by;

        
        System.out.println("byte -128 - 1 = " + bz);
        System.out.println("(int)(-128 - 1) = " + j2);
        
        System.out.println("------- Operaciones con short -------");

        
        short sx = 32767;
        short sy = 1;
        short sz = (short)(sx + sy); 

        
        System.out.println("short 32767 + 1 = " + sz);

        
        System.out.println("\n------- Operaciones con char -------");

        
        char cx = '\u001F';
        char cy = '\u0002';
        int z = cx + cy; 
        int w = cx + 2;  

        
        System.out.println("char: z = " + z);
        System.out.println("char(0x001F) + 2  = " + w);
    }
}

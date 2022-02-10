/*
16º. Hacer un programa que lea dos cadenas de caracteres y forme una tercera intercalando 
los caracteres de las palabras de las dos primeras cadenas. Escribir las tres cadenas.
*/

package Strings;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String cadena1, cadena2, cadena3="";
        int cant;
        
        System.out.println("Introducir cadena 1");
        cadena1=teclado.nextLine();
        System.out.println("Introducir cadena 2");
        cadena2=teclado.nextLine();
        
        if(cadena1.length()<cadena2.length())
            cant=cadena1.length();
        else
            cant=cadena2.length();
         
        for (int i=0;i<cant;i++)
            cadena3=cadena3+cadena1.charAt(i)+cadena2.charAt(i);
        
        System.out.println("La cadena 1 es "+cadena1);
        System.out.println("La cadena 2 es "+cadena2);
        System.out.println("La cadena resultante es "+cadena3);
            
             
    }
}

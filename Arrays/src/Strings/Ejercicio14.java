/*
14º. Introducir una cadena y determinar cuantas palabras hayen la cadena. 
Cada palabra se separa por medio de un espacio en blanco...
*/

package Strings;
public class Ejercicio14 {
    public static void main(String[] args) {
    
    String palabra=new String("Esta es la cadena");
    int cont=0;
    
    System.out.println("La cadena tendrá "+palabra.length()+" caracteres (incluyendo espacios)");
    
    String[] palabras=palabra.split(" ");
    
    for (int i=0;i<palabras.length;i++){
        System.out.println("\nPalabra "+(i+1)+":");
        for(int j=0;j<palabras[i].length();j++)     
            System.out.print(palabras[i].charAt(j)); 
    cont++;
    }
    
    System.out.println();
    System.out.println("\nLa cadena tendrá "+cont+" palabras.");
    
    }
}

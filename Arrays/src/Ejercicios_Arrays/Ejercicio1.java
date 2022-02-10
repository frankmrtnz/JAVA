/*
1º. Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
*/
package Ejercicios_Arrays;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[] numeros=new int[10];
        
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        
        for (int i = 0; i < numeros.length; i++) {
        numeros[i] = teclado.nextInt();
        // Aleatorio entre 0 y 99 seria: numeros[i]=(int)(Math.random()*100); 
       
        }
        
        System.out.println("\nLos números introducidos, al revés, son los siguientes:");
        for (int i = numeros.length-1; i >= 0; i--) {
        System.out.print(numeros[i]+", ");
        }
     
    }        
}

/*
12. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
El número n se debe introducir por teclado.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a=1,b=1,suma,cantidad;
        
        System.out.println("SERIE DE FIBONACCI");
        System.out.println("¿Cuantos numeros de la serie quiere escribir?");
        cantidad=teclado.nextInt();
        
        System.out.print(a+" "+b);
        for(int i=1;i<=cantidad-2;i++){
            suma=a+b;
            System.out.print(" "+suma);
            a=b;
            b=suma;
        }
          
    }
}    

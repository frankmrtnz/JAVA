/*
a) Un procedimiento que recibe un array de enteros y le asigna a cada componente los
 valores 0,3,6,..,3*n donde n es la longitud del array. 
*/
package Ejercicios2;
import java.util.Scanner;
public class Ejercicio2a {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n;
        
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        int[] array=new int[n];
        
        for(int i=0;i<array.length;i++)
            array[i]=3*i;
        
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        
    }
}

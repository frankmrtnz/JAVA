/*
b)El método public int sumaPares ( int Arr[ ] ) que recibe un array de enteros y devuelve 
el resultado de sumar sólo los números pares que hay dentro del array. 
*/

package Ejercicios2;
import java.util.Scanner;
public class Ejercicio3b {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n, auxiliar=0;
        
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        int[]array=new int[n];
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*n);    //  Generar numeros entre 0 y valor de n
            System.out.print(array[i]+" ");
        }
        
        System.out.println();
        
        for(int i=0;i<array.length;i++){   
            if(array[i]%2==0)
                auxiliar=auxiliar+array[i];                  
        }
        
        System.out.println("La suma total de los arrays pares es: "+auxiliar);
        
        
    }    
}

/*
c) El método public int cuentaRepeticiones ( int Arr[ ], int x ) que recibe un array de 
enteros y un valor entero x. El método devuelve el número de veces que se repite el 
valor de x en el array. 
*/

package Ejercicios2;
import java.util.Scanner;
public class Ejercicio3c {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n, x, y;
        int cont=0;
        
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        int[]array=new int[n];
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*n);
            System.out.print(array[i]+" ");
        }    
        
        do{
        System.out.println("\nIntroduce valor de x");
            x=teclado.nextInt();
        }while(x<0 || x>=n);
        
        for(int i=0;i<array.length;i++){
            if(array[i]==x)
                cont++;
        }
        System.out.println("El numero X se repite "+cont+" veces");
                
        
    }
}

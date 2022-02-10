/*
a)El método public int cuentaCeros ( int Arr[ ] ) que recibe un array de enteros y devuelve 
el número de ceros que se encuentran dentro del array. 
*/

package Ejercicios2;
import java.util.Scanner;
public class Ejercicio3a {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
     
        int n, cont=0;
     
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        int[] array=new int[n];
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*5);
            System.out.print(array[i]+" ");
        }
    
        for(int i=0;i<array.length;i++)
            if(array[i]==0)
                cont++;
                    
        System.out.println("\nEl array tiene "+cont+" ceros");
           
        
    }    
}

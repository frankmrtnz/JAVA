/*
Un procedimiento que recibe un array de valores booleanos y le asigna de manera
intercalada los valores true y false.
*/
package Ejercicios2;
import java.util.Scanner;
public class Ejercicio2c {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        
        int n;
        boolean m;
        
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        boolean[] array=new boolean[n];
        
        for(int i=0;i<array.length;i++)   //  for(int i=0;i<array.length;i=i+2)
            if(i%2==0)                    //  array[i]=true;                             
                array[i]=true;
            /* else Lo puedo quitar pq el array se inicializa todo a false. 
                array[i]=false; 
            */
        
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+", ");

    }
}

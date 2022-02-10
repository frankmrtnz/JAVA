/*
EJEMPLO DE TEORIA DE ARRAYS
*/

package arrays_teoria;
import java.util.Scanner;
public class EjemploArrays {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
                
        int[] array1=new int[5];
        double[] array2=new double[10];
        char[] array3={'x','1','A','*'};
        
        System.out.println("El tamaño del array de enteros es "+array1.length);
        System.out.println("El tamaño del array de doubles es "+array2.length);
        System.out.println("El tamaño del array de char es "+array3.length);
        
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        
        for (int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        
        for (int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }
        System.out.println();
        
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduce el valor "+(i+1)+" del array");
            array1[i]=teclado.nextInt();
        }
        
        for(int i=0;i<array2.length;i++){
            System.out.println("Se va a generar el contenido de la posicion "+(i+1));
            array2[i]=(double) Math.random()*20;   //   Desde el 0.0 hasta el 19.999...
        }
        
        System.out.println("Arrays en orden de creacion:");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<array1.length;i++){
            System.out.print(array2[i]+" ");            
        }
        System.out.println();
        
        System.out.println("Arrays en orden de creacion inverso:");
        for(int i=array1.length-1;i>=0;i--){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i=array2.length-1;i>=0;i--){
            System.out.print(array2[i]+" ");            
        }
        System.out.println();
        
        
    }
}

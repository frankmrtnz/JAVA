/*
Teoria de Arrays
*/

package arrays_teoria;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[] array1=new int[5];
        int[] array2={4,6,2,1};
        
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        // array1[3]=40;   Se puede dejar sin poner y le dará el valor 0 al ejecutar el array length
        array1[4]=50;
        // array[5]=60;   Esta linea daria una Exception, pues salgo de los limites.
        
        System.out.println(array2[1]+" "+array2[3]);
        
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]+" ");
        }
        
    }    
}

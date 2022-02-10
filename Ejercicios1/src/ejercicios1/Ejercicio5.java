/*
5. Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
 */

package ejercicios1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=320;
        
        while(i>=160){
            System.out.println(i);
            i=i-20;
        }
        
        
    }
    
}

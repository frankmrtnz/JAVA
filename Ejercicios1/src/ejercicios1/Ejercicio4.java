/*
4. Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int resta=320,i;
        
        for(i=1;i<=9;i++){
          System.out.println(resta);
          resta=resta-20;  
        }
        
    }    
}

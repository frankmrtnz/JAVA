/*
18. Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el menor
de los enteros introducidos e ir incrementando de 7 en 7.
*/

package ejercicios1;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int primerNumero, segundoNumero, auxiliar;
        
        // Pide dos números y se verifica que sean distintos.
        do{
            System.out.println("Introduce un número entero:");
            primerNumero=teclado.nextInt();
            System.out.println("Introduce otro número entero distinto al anterior:");
            segundoNumero=teclado.nextInt();
            
            if(primerNumero==segundoNumero){
                System.out.println("Los números introducidos no son válidos, deben ser distintos.");
            }
            
        }while(primerNumero==segundoNumero);
        
        // Si el primer número es > que el segundo, se intercambian los valores.
        if(primerNumero>segundoNumero){
            auxiliar=primerNumero;
            primerNumero=segundoNumero;
            segundoNumero=auxiliar;
        }
        
       for(int i=primerNumero;i<=segundoNumero;i=i+7){ 
           System.out.print(i+" ");  
       }
       
        System.out.println();
            
    }    
}

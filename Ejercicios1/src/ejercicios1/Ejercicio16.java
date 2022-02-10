/*
16. Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad.
*/

package ejercicios1;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,cont=0,i=2;
               
        System.out.println("Introduce numero a comprobar");
        numero=teclado.nextInt();
        
        while(i<numero && numero%i!=0)
            i++;
        if(i==numero)
            System.out.println("El numero "+numero+" es primo");
        else
            System.out.println("El numero "+numero+" NO es primo");
                
        /*for(int i=2;i<numero;i++){
        if(numero%i==0)
        cont++;
        }
        if(cont==0)
        System.out.println("El numero "+numero+" es primo");
        else
        System.out.println("El numero "+numero+" NO es primo");*/
             
    }    
}

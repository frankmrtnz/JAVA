/*
17. Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
*/

package ejercicios1;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int numeropos=0, suma=0;
       
       do{
           System.out.println("Introduce número entero positivo:");
           numeropos=teclado.nextInt();
           
           if(numeropos<0){
               System.out.println("Numero introducido NO es correcto, debe introducir un número entero positivo.");
           }
       }while(numeropos<0);
       System.out.println("Numero introducido correcto.");  
       
       for(int i=numeropos;i<numeropos+100;i++){
       suma=suma+i;
       }
       
       System.out.println("La suma de los 100 numeros siguientes a "+numeropos+" es "+suma);
       
    }    
}

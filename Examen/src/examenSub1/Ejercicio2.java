/*
2. Hacer un programa que imprima la siguiente salida. La altura se pedirá por teclado y
deberá ser un nº impar mayor de 5.
 ooooo
  ooo
   o
*/

package examenSub1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int altura;
        
        do{
            System.out.println("Introducir altura impar y > 5");
            altura=teclado.nextInt();
        }while(altura%2==0 || altura<=5);
        
        for (int i=altura;i>=1;i=i-2){ 
          for(int k=1;k<altura-i;k=k+2) 
            System.out.print(" ");
          for(int j=1;j<=i;j++) 
            System.out.print("o");
          System.out.println();                    
        }
        
        
    }
}

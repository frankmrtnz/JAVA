/*
2. Hacer un programa que lea un número entero positivo n mayor de 5 y escriba los números
tantas veces como indique su propio valor.
 Ej: Si n= 4, la salida será: 1223334444.
*/

package arrays_teoria;
import java.util.Scanner;
public class Ejemplo2_Repaso {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n;
        
        do{
            System.out.println("Introduce valor de n");
            n=teclado.nextInt();
        }while(n<=5);
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(i);
            }
        }
        
        
        
        
        
    }
}

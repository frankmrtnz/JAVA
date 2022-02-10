/*
3. Hacer un programa que dados dos números introducidos por teclado indique si son
amigos o no. Dos números amigos son dos enteros positivos tales que la suma de sus
 divisores es igual al otro número.
 Por ejemplo, 220 y 284 son amigos, ya que:
 Suma de divisores de 284: 1 + 2 + 4 + 71 + 142 = 220
 Suma de divisores de 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284.
 También son números amigos 17296 y 18416
*/

package examenSub1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n1, n2, s1=0, s2=0;
        
        do{
            System.out.println("Introducir primer numero");
            n1=teclado.nextInt();
        }while(n1<=0);
        
        do{
            System.out.println("Introducir primer numero");
            n2=teclado.nextInt();
        }while(n2<=0);
        
        for (int i=1;i<n1;i++)
            if(n1%i==0)
              s1=s1+i;
            
        for (int i=1;i<n2;i++)
            if(n2%i==0)
                s2=s2+i;

        if(s1==n2 && s2==n1)
            System.out.println("Los numeros son amigos");
        else
            System.out.println("Los numeros no son amigos");
                
    }
}

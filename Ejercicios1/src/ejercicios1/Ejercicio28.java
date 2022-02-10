/*
28. Escribe un programa que calcule el factorial de un número entero leído por teclado.
Ejemplo: Por favor, introduzca un numero entero: 6
         6! = 720
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero, factorial=1;
        
        System.out.println("Introduce numero del factorial a calcular");
        numero=teclado.nextInt();
        
        for(int i=1;i<=numero;i++){
            factorial=factorial*i;
                // System.out.println("Factorial "+factorial+", i "+i);
        }
        System.out.println("El factorial de "+numero+" es "+factorial);
        
        
    }
    
}

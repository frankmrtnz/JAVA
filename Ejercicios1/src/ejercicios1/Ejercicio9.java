/*
9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long numero, digitos=1;
        
        System.out.println("Introduce un numero para calcular sus dígitos");
        numero=teclado.nextLong();
        
        long n=numero;
        
        while(n>10){
            n=n/10;
            digitos++;
        }
        
        System.out.println(numero+" tiene "+digitos+" dígitos.");
        
    }   
}

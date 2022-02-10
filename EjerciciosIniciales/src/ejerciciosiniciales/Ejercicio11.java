/*
11 Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long numero;
        
        System.out.println("Introduce un numero entero");
        numero=teclado.nextLong();
        
        System.out.println("El ultimo digito del "+numero+" es "+(numero%10));
        
    }
    
}

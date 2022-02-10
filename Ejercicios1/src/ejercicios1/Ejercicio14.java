/*
14. Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double base, resultado=1;
        int exponente;
        
        System.out.println("Introduce una base:");
        base=teclado.nextDouble();
        System.out.println("Introduce un exponente:");
        exponente=teclado.nextInt();
        
        for(int i=1;i<=exponente;i++){
            resultado=resultado*base;
        }
        System.out.println(base+" elevado a "+exponente+" = "+resultado);
        
    }    
}

/*
Escribe un programa que solicite al usuario un número y le reste el 15%,
almacenando todo en una única variable. A continuación, mostrar el resultado
final en pantalla.
 */
package ejerciciosteoria;

import java.util.Scanner;
        
public class Ejercicio7 {
    public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
    double num1,porcentaje;
    
    System.out.println("Introduce un numero");
    num1=teclado.nextDouble();
    
    System.out.println("Al numero que has introducido le vamos a restar el 15%");
    porcentaje=num1*((double)0.85);
    
    System.out.println("El resultado final es "+porcentaje);
    
    
    }
}

/*
Escribe un programa que solicite al usuario ingresar tres números para luego
mostrarle el promedio de los tres.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double num1,num2,num3,suma,media;
        
        System.out.println("Introduce el primer numero");
        num1=teclado.nextDouble();
        
        System.out.println("Introduce el segundo numero");
        num2=teclado.nextDouble();
        
        System.out.println("Introduce el tecer numero");
        num3=teclado.nextDouble();
        
        suma=num1+num2+num3;
        media=suma/3;
        System.out.println("El promedio de los tres es "+media);
    
    }
    
    
}

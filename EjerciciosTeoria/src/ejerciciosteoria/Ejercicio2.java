/*
2.- Escribe un programa que solicite al usuario ingresar un número con decimales y almacénalo en una variable. 
A continuación, el programa debe solicitar al usuario que ingrese un número entero y guardarlo en otra 
variable. En una tercera variablese deberá guardar el resultado de la suma de los dos números ingresados 
por el usuario. Por Ultimo, se debe mostrar en pantalla el texto "El resultado de la suma es [suma]", 
donde "[suma]" se reemplazará por el resultado de la operación.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double numero2,suma,producto,division;
        int numero3,resto;
        System.out.println("Introduce un numero real");
        numero2=teclado.nextDouble();
        System.out.println("Introduce un numero entero");
        numero3=teclado.nextInt();
        suma=numero2+numero3;
        producto=numero2*numero3;
        division=numero2/numero3;
        resto=(int)numero2%numero3;
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado del producto es "+producto);
        System.out.println("El resultado de la division 5/2 es "+((double)5/2));
        System.out.println("El resto de la division es "+resto);
        
        
    }
}

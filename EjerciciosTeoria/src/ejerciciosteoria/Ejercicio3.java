/*
3.- Escribe un programa que solicite al usuario dos números y los almacene en
dos variables. En otra variable, almacená el resultado de la suma de esos dos
números y luego mostrá ese resultado en pantalla.
A continuación, el programa debe solicitar al usuario que ingrese un tercer
número, el cual se debe almacenar en una nueva variable. Por último, mostrá
en pantalla el resultado de la multiplicación de este nuevo número por el
resultado de la suma anterior
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num1,num2,num3,suma,producto;
        System.out.println("Introduce un numero entero");
        num1=teclado.nextInt();
        System.out.println("Introduce otro numero entero");
        num2=teclado.nextInt();
        suma=num1+num2;
        System.out.println("El resultado de sumar "+num1+" y "+num2+" es "+suma);
        System.out.println("Introduce el tercer numero entero");
        num3=teclado.nextInt();
        producto=suma*num3;
        System.out.println("El resultado de multiplicar "+suma+" y "+num3+" es "+producto);
    }
}

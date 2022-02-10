/*
Escribe un programa que solicite al usuario ingresar la cantidad de kilómetros
recorridos por una motocicleta y la cantidad de litros de combustible que consumió
durante ese recorrido. Mostrar el consumo de combustible por kilómetro.
*/
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double num1,num2,division;
        
        System.out.println("Introducir kilometros recorridos");
        num1=teclado.nextDouble();   
        
        System.out.println("Introducir litros de combustible gastados");
        num2=teclado.nextDouble();
        
        division=num2/num1;
        System.out.println("El consumo de combustible por kilometro es de "+division);

    }
}

/*
Estructuras de control -  Alternativas (Teoria)
 */
package EstructurasdeControl;

import java.util.Scanner;

public class Alternativas {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int edad;
        double descuento,precio;
        final double d1=15; /*Final es una constante y no se le puede cambiar el valor*/
        final double d2=10;
        
        System.out.println("Introducir su edad");
        edad=teclado.nextInt();
        
        System.out.println("Introducir precio del producto");
        precio=teclado.nextDouble();
        
        if(edad>=18&&edad<=25){
            System.out.println("Su edad = "+edad+" esta entre 18 y 25, le corresponde el 15% de descuento");
            descuento=precio*d1/100;
        }
        else{
            System.out.println("Su edad = "+edad+" NO esta entre 18 y 25, le corresponde el 10% de descuento");
            descuento=precio*d2/100;
        }
        
        precio=precio-descuento;
        System.out.println("El descuento realizado es "+descuento);
        System.out.println("El precio a pagar es "+precio);
           
        
        
    }
    
}

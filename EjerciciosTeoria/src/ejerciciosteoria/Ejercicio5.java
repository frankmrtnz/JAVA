/*
Escribe un programa que solicite al usuario el ingreso de una temperatura en
escala Fahrenheit (debe permitir decimales) y le muestre el equivalente en grados
Celsius.
La fórmula de conversión que se usa para este cálculo es: _Celsius = (5/9) *
(Fahrenheit-32)

 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        double Fahren,Cel;
        
        System.out.println("Introducir grados Fahrenheit");
        Fahren=teclado.nextDouble();
        
        Cel=(Fahren-32)*5/9;
        System.out.println(Fahren+" grados Fahrenheit son "+Cel+" grados Celsius");
        
        Cel=(5.0/9)*(Fahren-32);
        System.out.println(Fahren+" grados Fahrenheit son "+Cel+" grados Celsius");
        
        Cel=((double)5/9)*(Fahren-32);
        System.out.println(Fahren+" grados Fahrenheit son "+Cel+" grados Celsius");
        
    }
}

/*
1. Una línea de autobuses cobra un mínimo de 20 euros por persona y trayecto. Si el
trayecto es mayor de 200 km el billete tiene un recargo de 3 céntimos por km adicional.
Sin embargo, para trayectos de más de 400 km el billete tiene un descuento del 15 %.
Por otro lado, para grupos de 3 o más personas el billete tiene un descuento del 10 %.
Con las consideraciones anteriores, hacer un programa que lea por teclado la distancia
del viaje a realizar, así como el número de personas que viajan juntas, y calcule e
imprima tanto el precio del billete individual como el total a pagar si viaja más de una
persona.
*/

package examenSub1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int Km, personas;
        double precio;
        
        System.out.println("Introducir Km del trayecto");
        Km=teclado.nextInt();
        System.out.println("Numero de personas");
        personas=teclado.nextInt();
        
        if(Km<=200)
            precio=20;
        else precio=(Km-200)*0.03+20;
        
        if(Km>400)
            precio=precio*0.85;
        
        if(personas>=3)
            precio=precio*0.9;
        
        System.out.println("El billete individual cuesta "+precio);
        System.out.println("El total a pagar cuesta "+precio*personas);
        
        
    }  
}

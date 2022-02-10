/*
1. Hacer un programa para jugar a adivinar un número entre 1 y 100. El ordenador deberá 
generar aleatoriamente el número. El jugador introducirá un número y el juego le ira dando 
pistas de si el número introducido está por encima o por debajo. El juego termina cuando se 
adivina el número o se decide terminar de jugar tecleando un número negativo.
*/

package examensub2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int numero, nadivinar;
        
        nadivinar=(int)(Math.random()*100)+1;
        
        
        System.out.println("Introduce un numero entre 1 y 100 a adivinar (Pon negativo para salir):");
        numero=teclado.nextInt();
        
        while(numero!=nadivinar && numero>=0){        
            if(numero<nadivinar)
                System.out.println("Has introducido un número menor");
            else
                System.out.println("Has introducido un número mayor");
            System.out.println("Introducir número a adivinar entre 1 y 100 (Pon negativo para salir):");
            numero=teclado.nextInt();
        }
        
        if(numero==nadivinar)
            System.out.println("Enhorabuena, has acertado el número.");
        else
            System.out.println("Lo siento has perdido. El número era "+nadivinar);
        
    }
}

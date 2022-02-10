/*
EJEMPLO DE WHILE REPETITIVA
 */
package EstructurasdeControl;

import java.util.Scanner;

public class RepetitivaWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Introducir un numero >=0, negativo para acabar");
        numero=teclado.nextInt();
        
        while(numero>=0){
            System.out.println(numero);
            System.out.println("Introducir un numero >=0, negativo para acabar");
            numero=teclado.nextInt();
        }
        System.out.println("Fuera del Bucle");
        
    }
    
}

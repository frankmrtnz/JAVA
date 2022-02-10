/*
EJEMPLO DE REPETITIVA USANDO DO WHILE
 */
package EstructurasdeControl;

import java.util.Scanner;

public class RepetitivaDoWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        do{
            System.out.println("Introduce numero positivo");
            numero=teclado.nextInt();
            System.out.println("Has introducido: "+numero);
        }while(numero<0);
        
        // MISMO ejercicio hecho con while:
        System.out.println("Introduce numero positivo");
            numero=teclado.nextInt();
            while(numero>=0){
                System.out.println("Has introducido: "+numero);
                System.out.println("Introduce numero positivo");
                numero=teclado.nextInt();
            }
        
    }
    
}

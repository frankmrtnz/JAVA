/*
1. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */
package ejercicios1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int multiplo,i;
        
        System.out.println("Los multiplos de 5 serán: "); 
        for(i=0;i<=20;i++){
        multiplo=5*i;
            System.out.println(multiplo);
        }
        System.out.println("Ha salido fuera del bucle.");
        
    }    
}

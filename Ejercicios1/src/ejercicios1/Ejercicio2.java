/*
2. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
*/
package ejercicios1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int multiplo,i=0;
        
        System.out.println("Los multiplos de 5 seran: ");
        while(i>=0 && i<=20){
            multiplo=5*i;
            i++;
                System.out.println(multiplo);
        }
        System.out.println("Ha salido del bucle.");
        
    }   
}

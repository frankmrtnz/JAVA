/*
2. Hacer un programa que cree un array de 10 posiciones de números aleatorios entre 1 y 100. Posteriormente
 se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición.
 Math.random() → Devuelve un numero entre 0.0 y 1.0
 Math.floor(Math.random()*6) → Devuelve un numero entre 0 y 5
*/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int posicion;
        int[] aleatorios=new int[100];
        
        for(int i=1;i<=10;i++){
            aleatorios[i]=((int)(Math.random()*100)+1);  // Entre 0 y 99, pero con el +1 será entre 1 y 100.
            System.out.print(aleatorios[i]+" ");
        }
        
        System.out.println();
        do{
            System.out.println("Introduce la posición que quiere mostrar (Del 1 al 10)");
            posicion=teclado.nextInt();
        }while(posicion<1 || posicion>10);
        
        int i=posicion;
        System.out.println("Posicion["+i+"] = "+aleatorios[i]);
        
    }    
}

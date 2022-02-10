/*
EJERCICIO 1 - EXAMEN - Francisco Martinez Martin - 1DAW
*/

package examen;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[]array=new int[1];
        int numero, auxiliar, i;
        
        do{
        System.out.println("Introduce un numero a adivinar (Pon numero negativo para salir):");
            numero=teclado.nextInt();
        
        for (i=0;i<array.length;i++){
            array[i]=(int)((Math.random()*100)+1);
            // System.out.print(array[i]+" ");
            auxiliar=array[i];
            if(numero==auxiliar){
                System.out.println("Has acertado el numero");            
            }
            else if(numero<auxiliar){
                System.out.println("Has introducido un número menor");
            }
            else if(numero>auxiliar){
                System.out.println("Has introducido un numero mayor");
            }
        }
        }while(numero>0);
        System.out.println("Sales del programa al poner número negativo o al acertar el número");
        
    }   
}

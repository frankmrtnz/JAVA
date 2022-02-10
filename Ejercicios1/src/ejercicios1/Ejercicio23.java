/*
23. Escribe un programa que lea un número n e imprima una pirámide de números con n filas
como en la siguiente figura:
1
121
12321
1234321
*/

package ejercicios1;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int numero, j;
        
        System.out.println("Introduce un numero de filas:");
        numero=teclado.nextInt();
        
        System.out.println();
        
        for(int i=1;i<=numero;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=j-2;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
        
    }    
}

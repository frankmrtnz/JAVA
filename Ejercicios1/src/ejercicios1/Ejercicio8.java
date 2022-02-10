/*
8. Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero, resultado;
        
        System.out.println("Introduce un numero para mostrar su tabla de multiplicar");
        numero=teclado.nextInt();
        
        for(int i=0;i<=10;i++){
            resultado=numero*i;
            System.out.println(numero+" * "+i+" = "+resultado);            
        }
        
        
    }
    
}

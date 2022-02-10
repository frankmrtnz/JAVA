/*
10 Realizar un programa que diga si un número introducido por teclado es par y/o divisible entre 5
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un numero");
        numero=teclado.nextInt();
        
        
        if(numero%2==0)
            System.out.print("El numero "+numero+" es par ");
        else
            System.out.print("El numero "+numero+" NO es par ");
        
        if(numero%5==0)
            System.out.println("y divisible por 5");
        else
            System.out.println("y NO divisible por 5");
      
    }
    
}

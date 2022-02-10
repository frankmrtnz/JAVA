/*
19. Realiza un programa que pinte una piramide por pantalla. La altura se debe pedir por teclado. El carácter
con el que se pinta la piramide también se debe pedir por teclado.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int altura;
        char caracter;
        
        System.out.println("NUMERO: ");
        altura=teclado.nextInt();
        System.out.println("CARACTER: ");
        caracter=teclado.next().charAt(0);
        
        System.out.println();
        
        for(int alto=1; alto<=altura; alto++){
            // System.out.print("FILA "+alto+":");
            for(int espacios=altura-alto; espacios>=1; espacios--){
                System.out.print(" ");
            }
            for(int k=1; k<=alto; k++){
                System.out.print(caracter+" ");
            }
            System.out.println();
        }
                
    }
    
}

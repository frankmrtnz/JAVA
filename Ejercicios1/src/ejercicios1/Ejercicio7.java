/*
7. Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
programa pedirá la combinación para abrirla. Si no se acierta, se mostrará el mensaje “Lo
siento, esa no es la combinación” y si se acierta se dirá “La caja fuerte se ha abierto”. Se
tendrán cuatro oportunidades para abrir la caja fuerte.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int combinacion, clave=6960;
        
        
        for(int i=1;i<=4;i++){
            System.out.println("INTENTO "+i+" : Introduzca la combinación correcta");
            combinacion=teclado.nextInt();
            
            if(combinacion==clave){
                System.out.println("La caja fuerte se ha abierto");
                break;
            }else
                System.out.println("Lo siento, esa no es la combinación");
        }
        System.out.println("Ha salido fuera del control de acceso");
    }   
}

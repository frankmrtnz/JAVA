/*
6 Realizar un programa que calcule la media de tres notas.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio6V3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota,media=0;
        
        for(int i=1;i<=3;i++){
            System.out.println("Introduce nota "+i);
            nota=teclado.nextDouble();
            media=media+nota;
        }
        
        media=media/3;
        System.out.println("Su nota media es: "+media);

        
    }            
}
/*
6 Realizar un programa que calcule la media de tres notas.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio6V2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota,media,suma=0;
        
        System.out.println("Introduce la primera nota");
        nota=teclado.nextDouble();
        suma=suma+nota;   //   i=i+1;
        
        System.out.println("Introduce la segunda nota");
        nota=teclado.nextDouble();
        suma=suma+nota;
        
        System.out.println("Introduce la tercera nota");
        nota=teclado.nextDouble();
        suma=suma+nota;
        
        media=suma/3;
        System.out.println("Su nota media es: "+media);

    }            
}

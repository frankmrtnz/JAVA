/*
6 Realizar un programa que calcule la media de tres notas.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota1,nota2,nota3,media;
        
        System.out.println("Introduce la primera nota");
        nota1=teclado.nextDouble();
        System.out.println("Introduce la segunda nota");
        nota2=teclado.nextDouble();
        System.out.println("Introduce la tercera nota");
        nota3=teclado.nextDouble();
        
        media=(nota1+nota2+nota3)/3;
        System.out.println("La media de estas notas será: "+media);

    }            
}

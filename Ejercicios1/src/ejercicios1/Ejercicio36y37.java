/*
36. Realiza un conversor del sistema decimal al sistema de “palotes”. El 0 se representa con un "–" 
y la separación entre números también con un "–".
Ejemplo: Introduzca un número entero positivo: 47021 
47021 en el sistema de palotes es
||||-|||||||---||-|
-----------------------------------
37. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de 
un número. Usar long en lugar de int ya que el primero admite números más largos.
Ejemplo: Introduzca un número entero positivo: 406783 
406783 contiene 4 dígitos pares y 2 dígitos impares.

 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio36y37 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long numero, auxiliar, invertido=0;
        int contp=0, contim=0;
        
        System.out.println("Introduce un numero: ");
        numero=teclado.nextLong();
        auxiliar=numero;
        
        System.out.println("El numero "+numero+" en sistema de palos es: ");
        
        // Damos la vuelta al numero
        while(auxiliar>0){
            invertido=invertido*10+auxiliar%10;
            auxiliar=auxiliar/10;
        }
        
        while(invertido>0){
            auxiliar=invertido%10;
            if(auxiliar==0)
                System.out.print("-");
            else 
                for (int i=1; i<=auxiliar; i++) 
                    System.out.print("|");
                
            System.out.print(" - ");
            if (auxiliar%2==0) 
                contp++;
            else
                contim++;
            invertido=invertido/10;
        }
        System.out.println();
        System.out.println("El numero "+numero+" tiene "+contp+" digitos pares y "+contim+" digitos impares");
        
    }                       
}                        



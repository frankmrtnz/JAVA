/*
10. Escribe un programa que calcule la media de un conjunto de números positivos introducidos
por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double numIntroducido=0, numeros=0, suma=0;
        
        System.out.println("Este programa calcula la media de los numeros positivos que introduzcas.");
        System.out.println("Vaya introduciendo numeros, puede parar introduciendo un numero negativo");
        
        while(numIntroducido>=0){
            numIntroducido=teclado.nextDouble();
            numeros++;
            suma=suma+numIntroducido;
        }
        
        System.out.println("La media de los numeros positivos introducidos es: "+(suma-numIntroducido)/(numeros-1));
        
        
        
        

    }  
}

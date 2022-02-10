/*
25-26. Realiza un programa que pida primero un numero y a continuacion un digito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese digito
en el numero introducido
*/
package ejercicios1;
import java.util.Scanner;
public class Ejercicio25y26 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero, digito, auxiliar, invertido=0;
        
        System.out.println("Introduce un numero: ");
        numero=teclado.nextInt();
        auxiliar=numero;
        do{
        System.out.println("Introduce un digito a buscar: ");
        digito=teclado.nextInt();
        }while(digito<0 || digito>9);
        
        // Damos la vuelta al numero
        while(auxiliar>0){
            invertido=invertido*10+auxiliar%10;
            auxiliar=auxiliar/10;
        }
        
        int i=1;
        while(invertido>0){
            if(invertido%10==digito)
                System.out.println("El digito "+digito+" se encuentra en la posicion "+i);
            invertido=invertido/10;
            i++;
        }
            
    }
    
}

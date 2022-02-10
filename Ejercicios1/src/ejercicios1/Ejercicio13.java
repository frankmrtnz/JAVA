/*
13. Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
cuántos son negativos.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,contpos=0,contneg=0,contcero=0;
        
        for(int i=1;i<=10;i++){
            System.out.println("Introducir numero");
            numero=teclado.nextInt();
            if(numero==0)
                contcero++;
            else if(numero>0)
                contpos++;
            else 
                contneg++;
        }
        
        System.out.println("De la lista introducida hay: "+contpos+" numeros positivos, "+contneg+" numeros negativos y "+contcero+" numeros cero.");
            
    }    
}

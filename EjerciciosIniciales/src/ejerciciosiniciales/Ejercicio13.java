/*
13 Realizar un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
Se permiten números de hasta 5 dígitos.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,contadordigitos=0,copianumero;
        
        do{
        System.out.println("Introducir numero entre -99999 y 99999");
        numero=teclado.nextInt();
        }while(numero<-99999 || numero>99999);
        copianumero=numero;
        
        if(copianumero<0){
            copianumero=copianumero*(-1);
        }
        
        while(copianumero>0){
            copianumero=copianumero/10;
            contadordigitos++;
            System.out.println(copianumero+" "+contadordigitos);
        }
        
        System.out.println("El numero "+numero+ " tiene "+contadordigitos+" digitos");
                
    }
}

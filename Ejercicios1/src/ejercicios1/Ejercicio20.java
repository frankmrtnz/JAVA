/*
20. Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y
nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se
incluye en el cómputo.
*/
package ejercicios1;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int num, cont=0, contImpar=0, suma=0, mayor=-1;
        
        System.out.println("Introduce numero:");
        num=teclado.nextInt();
        
        while(num>=0){
            cont++;
            if(num%2!=0){
                contImpar++;
                suma=suma+num;
            }else{
                if(mayor==-1){
                    mayor=num;  // Esto sirve para la primera vez que lee, que meta el num en la variable mayor.
                }else if(num>mayor){
                    mayor=num;
                }                   
            }
            System.out.println("Introduce numero:");
            num=teclado.nextInt();
        }
        
        System.out.println("Se han introducido "+cont+" números.");
        
        if(mayor==-1){
            System.out.println("No has introducido ningún número par.");
        }else{
            System.out.println("El mayor número par introducido es: "+mayor);
        }
        
        if(contImpar==0){
            System.out.println("No se han introducido números impares, por tanto no hay media.");
        }else{
            System.out.println("La media de los impares es: "+suma/contImpar);
        }
        
    }    
}

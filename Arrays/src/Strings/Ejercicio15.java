/*
15º. Introducir un número telefónico en formato de cadena y lo convierta de la siguiente manera:
 Número Telefónico: 916463080
 Nueva Cadena: (91)-646-30-80
*/

package Strings;
import java.util.Scanner;
 class Ejercicio15 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String telefono;
         
        do{
            System.out.println("Introducir numero telefono (9 digitos)");
            telefono=teclado.next();
        }while(telefono.length()!=9);
        
        String c1=telefono.substring(0, 2);
        String c2=telefono.substring(2, 5);
        String c3=telefono.substring(5, 7);
        String c4=telefono.substring(7, 9);
        String nuevo="("+c1+")-"+c2+"-"+c3+"-"+c4;
         
        System.out.println(telefono+"\n"+nuevo);
        System.out.println("("+c1+")-"+c2+"-"+c3+"-"+c4);
        
         
     }
}

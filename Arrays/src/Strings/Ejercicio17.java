/*
17º. Introducir un texto y mostrar que letras (de todo el vocabulario) no han aparecido en el texto.

*/

package Strings;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int cont=0;
        String texto;
        String nueva="";
        String mensaje="";
        
        System.out.println("Introduce un texto");
        texto=teclado.nextLine();       /*  Nos permite leer varias palabras (reconoce el espacio)  */
        
        for (int i=0;i<texto.length();i++) {
            if(texto.charAt(i)!=' '){
                nueva=nueva+texto.charAt(i);
            }
        }
        
        nueva=texto.toLowerCase();     /*  Convierte el texto en minusculas  */
        
        for (char caracter='a';caracter<='z';caracter++) {
            for (int i=0;i<nueva.length();i++) {
                if(caracter==nueva.charAt(i)){
                    cont++;
                }
            }
                if(cont==0){
                    mensaje=mensaje+caracter+" ";
            }
                cont=0;
        }
        
        System.out.println("\nLos caracteres que faltan son: \n"+mensaje);
  


    }
}

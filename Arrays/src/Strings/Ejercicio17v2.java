/*
17º. Introducir un texto y mostrar que letras (de todo el vocabulario) no han aparecido en el texto.
*/
package Strings;
import java.util.Scanner;
public class Ejercicio17v2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[] letras=new int[26];
        
        String texto;
        
        System.out.println("Introducir texto");
        texto=teclado.nextLine();      /*  Nos permite leer varias palabras (reconoce el espacio)  */
        
        texto=texto.toLowerCase();     /*  Convierte el texto en minusculas  */
        
        System.out.println(texto);
        
        for (int i=0;i<texto.length();i++)
            if(texto.charAt(i)>96 && texto.charAt(i)<123)
                letras[texto.charAt(i)-97]++;
            
        
        System.out.println("Las letras que no aparecen en el texto son:");
        for (int i=0;i<letras.length;i++) 
            if(letras[i]==0) 
                System.out.print((char)(i+97)+" ");
        
        System.out.println();
        
        
        
    }
}

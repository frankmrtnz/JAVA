/*
17º. Introducir un texto y mostrar que letras (de todo el vocabulario) no han aparecido en el texto.
*/
package Strings;
import java.util.Scanner;
public class Ejercicio17v3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[] letras=new int[26];
        char[] caracter={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
        
        String texto;
        
        System.out.println("Introducir texto");
        texto=teclado.nextLine();      /*  Nos permite leer varias palabras (reconoce el espacio)  */
        
        texto=texto.toLowerCase();     /*  Convierte el texto en minusculas  */
        
        System.out.println(texto);
        
        int j;
        for (int i=0;i<texto.length();i++){
            j=0;
            while(j<caracter.length && texto.charAt(i)!=caracter[j])
                j++;
            if(j<caracter.length)
                letras[j]++;  
        }
            
        
        System.out.println("Las letras que no aparecen en el texto son:");
        for (int i=0;i<letras.length;i++) 
            if(letras[i]==0) 
                System.out.print(caracter[i]+" ");
        
        System.out.println();
        
        
        
    }
}

/*
Strings = Objeto     //    Ejemplo Teoria
*/

package strings;
import java.util.Scanner;
public class Cadena {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    
    String frase="Esta es la frase";
    String frase1=new String("Esta es la frase 1");
    
    System.out.println("La frase tiene una longitud de "+frase.length()+" caracteres");
    System.out.println("La frase1 tiene una longitud de "+frase1.length()+" caracteres");
    
    for (int i=0;i<frase.length();i++)
        System.out.print(frase.charAt(i)+" ");      //  Coge el primer caracter del String.
    
    frase="la";
    System.out.println("\n"+frase.compareTo("la"));   //  Lo compara segun el codigo alfabetico ASCII, y puede dar negativo si el ASCII a comparar es menor que el introducido.
    
    System.out.println("Introducir palabra(Fin de palabra)");
        frase=teclado.next();
        
    while(frase.compareTo("Fin")!=0){
        /*  System.out.println(frase+" "+frase.compareTo("Fin"));  */
        System.out.println("Introducir palabra(Fin para acabar)");
        frase=teclado.next();
    }

    
    String[] palabras=frase1.split(" ");    //  Script que separa las palabras/letras dividiendolas por espacios en este caso.
        
      /*  for (int i=0;i<palabras.length;i++)    //  Este length va sin () al ser propiedad del array.
            System.out.println(palabras[i]);  */
            
        for (int i=0;i<palabras.length;i++){
            System.out.println("\nPalabra "+(i+1));
            for(int j=0;j<palabras[i].length();j++)     //  Este length si que va con () al ser un objeto, y no propiedad.
                System.out.print(palabras[i].charAt(j)+" ");    
        }
    
        
    
    frase1="123";
    int num=5678;
    
    System.out.println();
    System.out.println("\n"+Integer.parseInt(frase1));    //   Lo que esta entre comillas del String(cadena) se transforma en entero.
    System.out.println(Integer.parseInt(frase1)+num); 
    System.out.println(String.valueOf(num));              //   Lo que esta como entero se transforma en String(cadena).
    System.out.println(String.valueOf(num)+frase1);
    
    
    }
}

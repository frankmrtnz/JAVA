/*
COMO Y CUANDO USAR STRING, CHAR Y CHARAT()
 */
package EstructurasDeControl;
import java.util.Scanner;
public class char_String_charAt {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena1,cadena2;
        char caracter1,caracter2;
        
        System.out.println("Cadena 1");
        cadena1=teclado.next();
        System.out.println("Cadena 2: HOLA");
        cadena2="HOLA";
        caracter1=cadena1.charAt(0);
        caracter2=cadena2.charAt(2);
        System.out.println(caracter1+" "+caracter2);
        
        
    }    
}

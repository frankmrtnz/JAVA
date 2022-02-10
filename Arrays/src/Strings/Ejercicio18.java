/*
18º. Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que no 
puedan ser interpretados con una lectura directa, para lo cual han establecido las siguientes reglas:
a) Todo mensaje debe estar sus letras en mayúsculas.
b) Reemplazar cada letra por la que sigue según abecedario, excepto Z que reemplazará con A
c) Reemplazar cada dígito encontrado por el siguiente número excepto el 9 que deberá ser reemplazado por el 0.
Hacer un programa que introduzca un texto y lo codifique según las reglas anteriores. 
Finalmente, mostrar el texto original y el texto codificado.
*/

package Strings;
import java.util.Scanner;        
import java.util.Arrays;       //  Se importa para usar:  char[] cod=codificado.toCharArray();
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String mensaje, codificado;
        
        System.out.println("Introducir texto a codificar");
        mensaje=teclado.nextLine();
        
        codificado=mensaje.toUpperCase();      /*   Convierte el texto en mayusculas  */
        
        
        char[] cod=codificado.toCharArray();    /* Convierte el codificado en un array separando todo con comas y espacios */
        
        System.out.println(Arrays.toString(cod));
        
        for (int i=0;i<cod.length;i++) {
            if(cod[i]>='0' && cod[i]<='9')
                if(cod[i]=='9')
                    cod[i]='0';
                else
                    cod[i]=(char)((int)cod[i]+1);
  
            if(cod[i]>='A' && cod[i]<='Z')
                if(cod[i]=='Z')
                    cod[i]='A';
                else
                    cod[i]=(char)((int)cod[i]+1);
        }
        
        codificado=String.valueOf(cod);    
        
        System.out.println("Mensaje original: "+mensaje);
        System.out.println("Mensaje codificado: "+codificado);
        
        
        
        
  
        
    }
}

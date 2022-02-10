
package teoriaficheros.Texto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            
            File f = new File("texto.txt");
            
            FileWriter fw = new FileWriter(f, true); //El true indica que abre el fichero para añadir a los caracteres ya existentes, no para sustituirlos
            /* FileReader fw = new FileWriter(f); 
             ERROR DE SUSPENSO, No puedo hacer un Reader del mismo fichero si no cierro el Writer primero. 
             De distintos ficheros sí se puede. */
            char letra;
            System.out.println("Introduce un caracter, * para acabar");
            letra = teclado.next().charAt(0);
            while(letra != '*') {
                fw.write(letra);
                fw.write("\r\n"); //Hace salto de línea
                System.out.println("Introduce un caracter * para acabar");
                letra = teclado.next().charAt(0);
            }
                
            fw.close(); //Esto cierra el FileWriter
            
            
            
            FileReader fr = new FileReader(f);
            int caracter = fr.read();
            while(caracter != -1){
                System.out.println("Codigo ASCII: "+caracter+" - Caracter: "+(char)caracter);
                caracter = fr.read();
            }
            
            fr.close(); //Cierra el FileReader

            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
}

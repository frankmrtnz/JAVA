
package teoriaficheros.Texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            
            File f = new File("parrafo.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);  //Lee lineas enteras
            
            String cadena;
            System.out.println("Introducir nombres a guardar (fin para acabar)");
            cadena = teclado.nextLine();
            while(!cadena.equalsIgnoreCase("fin")){
                bw.write(cadena);
                bw.newLine();
                System.out.println("Introducir nombres a guardar (fin para acabar)");
                cadena = teclado.nextLine();           
            }

            bw.close();
            fw.close(); 
            
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            cadena = br.readLine();
            
            while(cadena!=null){
                System.out.println(cadena);
                cadena = br.readLine();                  
            }
            
            fr.close();
            br.close();
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
}
